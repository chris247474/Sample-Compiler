grammar ScannerALT;

options {
  language = Java;
  output = AST; 
  ASTLabelType=CommonTree;  
  backtrack = true;  
}

tokens {
	NEGATION;
}

@header {
  package scan;
}

@lexer::header {
  package scan;
}
/*
@lexer::members {

  private Token last = null;

  @Override
  public Token emit() {
    last = super.emit();
    if(last.getType() == ID)
    	Main.addID(last.getText());
    	
    return last;
  }
}*/
@members {
    private List<String> errors = new ArrayList<String>();
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg);
    }
    public List<String> getErrors() {
        return errors;
    }
    
    protected Object recoverFromMismatchedToken(IntStream input,
                                            int ttype,
                                            BitSet follow)
    																throws RecognitionException
	{   
    	throw new MismatchedTokenException(ttype, input);
	}   
}

program
	:	includeDecl* constant* function* 
	 	 main 
		function*
	;

includeDecl 
	:	'include' ID '.alt'';'!
	;
	
main
	:	'main'! '()'!'{'!
			(statement | variable | expression)*	
		'}'!
	;

constant
	:	'const' type! ID '='^ expression ';'!
	;

variable
	:	'var'^ type! ID ('=' expression)? (',' ID ('=' expression)?)* ';'!
	;
	
type
	: 'int' 
	| 'float' 
	| 'char' 
	| 'double'
	| 'long'
	| 'string'
	| 'bool'
	;
	
statement
	:	assignmentStatement ';'!
	|	ifStatement
	|	switchStatement
	|	whileStatement
	|	forStatement
	|	doWhileStatement	
	|	functionCallStatement';'!
	|	outStatement ';'!
	;
	
outStatement
	:	'print'^ '('! term ')'!
	;
		
functionCallStatement
	:	ID '(' actualParameters? ')' 
	;
	
actualParameters
	:	expression (',' expression)*
	;
	
ifStatement
	:	'if'^ '('! expression ')'! '{'! 
			(statement* exitStatement? continueStatement?)^'}'!
			//('else if''(' expression ')' '{'  statement* exitStatement? continueStatement?'}')*
			//('else''{' statement* exitStatement? continueStatement? '}')?		
	;

switchStatement
	:	'switch'^ '('! ID ')'! '{'!
			caseStatement+
			defaultStatement?
		'}'!
	;	
	
caseStatement
	:	('case'^ (CHAR_LITERAL | INTEGER) ':'! statement* exitStatement?)
	;	
	
defaultStatement
	:	('default'^ ':'! statement* exitStatement?)
	;
	
assignmentStatement
	:	ID '='^ expression 
	;
	
exitStatement
	:	'break'';'! 
	;
	
continueStatement
	:	'continue' ';'! 
	;	
	
whileStatement
	: 	'while' '(' expression ')''{' (statement)* exitStatement? continueStatement? '}'
	;
	
forStatement
	:	'for' '(' (assignmentStatement)? ';' expression? ';' expression? ')' '{' (statement)* exitStatement? continueStatement? '}'
	;	
	
doWhileStatement
	:	'do' '{' (statement)* exitStatement? continueStatement? '}' 'while' '(' expression ')' ';'
	;
	
returnStatement
	:	'return' expression ';' 
	;

function
	:	(type | 'void') ID '(' (parameters)? ')' '{'
		(variable | statement | returnStatement)*
		'}'
	;	
	
parameters
	:	parameter (',' parameter)*
	;
	
parameter
	:	type ID ('['']')*
	;
	
term
	:	ID
	|	'('! expression ')'!
	|	INTEGER
	|	STRING_LITERAL
	|	CHAR_LITERAL
	|	FLOAT
	|	ID '(' actualParameters ')'
	|	ARRAYID
	;
	
negation
	:	'!'* term
	;
	
unary
	:	('+'! | neg^)* negation
	;
	
neg
	:	'-' -> NEGATION	
	;

mult
	:	unary (('*'^ | '/'^ | 'mod'^) unary)*
	;
	
add
	:	mult (('+'^ | '-'^) mult)*
	;

relation
	:	add ((COMPAREOPS^) add)*
	;
	
expression
	:	relation ((LOGICALOPS^) relation)* 
	;

/* REGULAR EXPRESSIONS
*/

MULTILINE_COMMENT 
	: '/*' .* '*/' {$channel = HIDDEN;} 
	;

STRING_LITERAL
	:	'"'
		{ StringBuilder b = new StringBuilder(); }
		(	'"' '"'				{ b.appendCodePoint('"');}
		|	c=~('"'|'\r'|'\n')	{ b.appendCodePoint(c);}
		)*
		'"'
		{ setText(b.toString()); }
	;
	
CHAR_LITERAL
	:	'\'' . '\'' {setText(getText().substring(1,2));}
	;

fragment
LETTER 
	: ('a'..'z' | 'A'..'Z') 
	;
	
fragment 
DIGIT 
	: '0'..'9'
	;
	
INTEGER 
	: DIGIT+
	;
	
FLOAT
	: (DIGIT+ '.' DIGIT+ EXPONENT?
	| '.' DIGIT+ EXPONENT?
	| DIGIT+ EXPONENT)
	;
	
fragment
EXPONENT
	: ('^') ('+'|'-')? DIGIT+
	;	

COMPAREOPS
	: '==' | '<>' | '>=' | '<=' | '>' | '<' | '!>' | '!<'
	;
	
LOGICALOPS
	: '&&' | '||'
	;
	
MATHOPS
	: '+' | '-' | '*' | '/' | '%'
	;
	
ID 
	: ('_')?(LETTER)(LETTER | DIGIT | '_' )*
		
	;
	
ARRAYID
	: ID ('[' ID ']')+
	| ID ('[' INTEGER ']')+
	;
	
TERMINATOR
	: ';'
	;		
	
WS 
	: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;}
	;
	
COMMENT 
	: '//' .* ('\n'|'\r') {$channel = HIDDEN;}
	;	