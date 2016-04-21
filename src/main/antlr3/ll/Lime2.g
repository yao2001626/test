grammar Lime2;

options{
  output = AST;
  ASTLabelType = CTree;
}

r 
  : class_declaration+ EOF  
  ;
class_declaration
  : Class ID (attribute | initialization | method | action )* End 
  ;
attribute
  : Attribute varList 
  ;
initialization
  : Initialization '(' varList? ')' statement
  ;
method
  : Method ID ('('varList ')')? (':' typeList)? (When expression Do)? statement
  ;
action
  : Action ID (When expression Do)? statement
  ;
statement options {backtrack = true;}
  :compound_statement
  |assignment_expression
  |postfix_expression
  |Return expressionRoot  
  |If expressionRoot Then s1=statement Else s2=statement
  |While expressionRoot Do statement 
  ;

compound_statement
	: Begin statement (';' statement)* End
	;
  
varList
	: idList ':' type (',' idList ':' type)*
	;
idList
	: ID (',' ID)*
	;
typeList
	: type (',' type)*
	;

type
	: 'int'
	| 'void'
	;
assignment_expression
	: postfix_expression ('=' expressionRoot)?
	;
	
expressionRoot
  : expression 
  ;
expression 
  : conditional_expression 
  ;
conditional_expression
  : relational_expression (('=='|'!=') relational_expression)?
  ;
relational_expression
  : additive_expression (('<'|'>'|'<='|'>=') additive_expression)*
  ;
additive_expression
  : postfix_expression (('+'|'-') postfix_expression)*
  ;
postfix_expression
  : primary_expression 
    (
      '('argument_expression_list ')' 
    | '('')'
    )
  ;
  
argument_expression_list
  : expression (',' expression )* 
  ;
  
primary_expression
  : ID
  |INT
  |'('expression ')'
  ;
  
Assert   		: 'assert';
Class    		: 'class';
Action   		: 'action';
Inherit  		: 'inherit';
End      		: 'end';
Attribute		: 'attr ';
Initialization	: 'initialization';
Method   		: 'method';
New      		: 'new';
When     		: 'when';
Do             	: 'do';
Begin    		: 'begin';
If       		: 'if';
Else     		: 'else';
Then     		: 'then';
While    		: 'while';
Return   		: 'return';
Var      		: 'var ';
Null    		: 'nil';
Booltype		: 'bool';
Inttype			: 'integer';
	
Bool
	: 'true' 
	| 'false'
	;

ID
	:LETTER (LETTER|'0'..'9')*
	;
	
fragment
LETTER
	:	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

INT : '0'..'9'+ ;

STRING: '"' .* '"' {setText(getText().substring(1, getText().length()-1));} ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
