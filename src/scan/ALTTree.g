tree grammar ALTTree;

options {
  language = Java;
  tokenVocab = ScannerALT;
  ASTLabelType = CommonTree;
}

@header {
  package scan;
  import java.util.Map;
  import java.util.HashMap;
  import scanneralt.Main;
}

@members {
  private Map<String, Integer> variables = new HashMap<String, Integer>();
  private Map<String, Integer> constants = new HashMap<String, Integer>();
}

evaluator returns [int result]
	:	constant* (outStatement | switchStatement | declaration | assignment)* e=expression EOF { result = e; }
	;
	
constant
	:	^('=' 'const' ID e=expression)	
			{ constants.put($ID.text, e); }
	;

declaration
	:	^('var' ID)
			{	if (variables.get($ID.text) != null)
				{
					Main.setOutput("Variable " + $ID.text + " has already been declared.");
				}
				else
				{
					variables.put($ID.text, 0);					
				}
				//System.out.println(variables.get($ID.text));
			}
	;
	
assignment
	:	^('=' ID e=expression)
			{ 	if ( constants.get($ID.text) != null )
				{	Main.setOutput("Cannot assign to a constant");
				}
				else if ( variables.get($ID.text) != null )
				{	variables.put($ID.text, e);
					 
				}
				else
				{	Main.setOutput("The variable " + $ID.text + " has not yet been declared");
				}
			}
	;
	
outStatement
	:	^('print' t=term)
			{ Main.setOutput(t); }
	;	
	
switchStatement
	:	^('switch' c = term caseStatement+ defaultStatement?)
	;	
	
caseStatement
	:	^('case' c = term outStatement 'break'?)
	;
	
defaultStatement
	:	^('default' c = term outStatement 'break'?)
	;
	
term returns [String str]
	:	ID	{ if ( (variables.get($ID.text) != null)) { str = ""+ variables.get($ID.text); }
			  else if (constants.get($ID.text) != null) { str = ""+ constants.get($ID.text); } }
	|	'(' e=expression ')'	{str = ""+e; }
	|	INTEGER		{ str = $INTEGER.text; }
	|	STRING_LITERAL { str = $STRING_LITERAL.text;}
	|	CHAR_LITERAL { str = $CHAR_LITERAL.text; }
	|	FLOAT { str = $FLOAT.text; }
	;
		
expression returns [int result]
	: ^('+' op1=expression op2=expression) {result = op1 + op2;}
	| ^('-' op1=expression op2=expression) {result = op1 - op2;}
	| ^('*' op1=expression op2=expression) {result = op1 * op2;}
	| ^('/' op1=expression op2=expression) 
		{if (op2 == 0) 
			{Main.setOutput("Cannot Divide by Zero"); 
			} else 
			{result = op1 / op2; 
			}
		 }
	| ^('mod' op1=expression op2=expression) {result = op1 \% op2;}
	| ^(NEGATION e=expression) { result = -1 * e; }
	| INTEGER { result = Integer.parseInt($INTEGER.text); }
	| ID { if (variables.get($ID.text) != null) { result = variables.get($ID.text); }
			else if (constants.get($ID.text) != null) { result = constants.get($ID.text); } }
	;
