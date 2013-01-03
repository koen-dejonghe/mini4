grammar Mini4;


@header {
package com.fo.mini4;
}

@members {
}

prog:   stat+ ;

stat:  
		'def' ID ('=' expr)? ';'	# def
    |    qid '=' expr ';' 	# assign
    |	'assert' expr ';'	# assert    
    |	'print' expr ';'	# print
    |	'println' expr ';'	# println
    |	'return' expr? ';'	# returnLabel
    |	block				# blockLabel
    |	expr ';'			# exprLabel
    ;

expr:   expr op=('*'|'/') expr	# MulDivExpr
    |   expr op=('+'|'-') expr	# AddSubExpr
	|	expr op=(LT|LE|GT|GE) expr	# relExpr   
	|	expr op=(EQ|NE) expr	# eqExpr    
	|	expr op=AND expr	# andExpr
	|	expr op=OR expr		# orExpr
    |   brick	# brickLabel
    ;
    
block
	:	'{' stat* '}'
	;

brick
	:	INT	# int
	|	FLOAT	# float
	|	BOOL # bool
	|	NIL # nil
	|	Q_STRING	# qString
	|	QQ_STRING	# qqString
    |   qid	# qidLabel
    |   '(' expr ')'	# parens
    |	'{' mapExpr? '}'	# mapExprLabel
    |	'function' '(' parDefList? ')' block	# functionDef
    |	functionCall	# functionCallLabel
	;
	
qid
	:	ID postfix*
	;
	
postfix
	:	'.' ID	# memberDecl
	;
	
functionCall
	:	qid '(' (expr (',' expr)*)? ')'
	;	

mapExpr
	:	mapElDecl (',' mapElDecl)*
	;
	
mapElDecl
	:	ID '=' expr
	;		
	
parDefList
	:	ID (',' ID)*
	;	
	
BOOL:	'true' | 'false' //put this before ID, otherwise lexer thinks this is an identifier
	;
	
NIL	:	'nil'
	;		
	
MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z_][a-zA-Z_0-9]* ;      // match identifiers
INT :   [0-9]+ ;         // match integers
EQ	:	'==';  
NE	:	'!='; 
LT	:	'<'; 
LE	:	'<='; 
GT	:	'>'; 
GE	:	'>='; 
AND	:	'&&';
OR	:	'||';
NOT	:	'!';

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   ('0'..'9')* '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;   
		
SL_COMMENT
    :   '#' ~[\r\n]* -> skip;
    
ML_COMMENT:	'/*' ~('*/')* '*/' -> skip;

Q_STRING
    :  '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;
    
QQ_STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

WS  :   [ \t\r\n]+ -> skip ; // toss out whitespace

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' (
    		'b' 
    	|	't'
    	|	'n'
    	|	'f'
    	|	'r'
    	|	'\"'
    	|	'\''
    	|	'\\'
    )
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

