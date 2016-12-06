lexer grammar ScannerALT;

	
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
	

COMPAREOPS
	: '==' | '<>' | '>=' | '<=' | '>' | '<' | '!>' | '!<'
	;
	
LOGICALOPS
	: '&&' | '||' | '!'
	;
	
MATHOPS
	: '+' | '*' | '/' | '%'
	;
		
fragment 
DIGIT 
	: '0'..'9'
	;

INTEGER
	: POSINTEGER
	| NEGINTEGER
	;
	
fragment	
POSINTEGER 
	: DIGIT+ 
	;
	
fragment	
NEGINTEGER
	: '-' DIGIT+	
	;

FLOAT
	: POSFLOAT
	| NEGFLOAT
	;
	
fragment
POSFLOAT
	: (DIGIT+ '.' DIGIT+ EXPONENT?
	| '.' DIGIT+ EXPONENT?
	| DIGIT+ EXPONENT)
	;
fragment	
NEGFLOAT
	: '-' (DIGIT+ '.' DIGIT+ EXPONENT?
	| '.' DIGIT+ EXPONENT?
	| DIGIT+ EXPONENT)
	;
	
fragment
EXPONENT
	: ('e'|'E') ('+'|'-')? DIGIT+
	;	
	
ASSIGN
	: ID '='
	| ARRAYID '='
	;			
   	
ID
	: (LETTER|'_') (LETTER | DIGIT | '_' )+
	;
	
ARRAYID
	: ID '[' ID ']'
	| ID '[' INTEGER ']'
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
