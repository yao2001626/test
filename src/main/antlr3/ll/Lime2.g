grammar Lime2;

options{
  output = AST;
  ASTLabelType = CTree;
}

r 
  : calss_declaration+ EOF  
  ;
class_declaration
  : Class Indetifier (attribute | initialization | method | action )* End 
  ;
attribute
  : Attribute varList 
  ;
initialization
  : Initialization '(' varList? ')' statement
  ;
method
  : Method Identifier ('('varList ')')? (':' typeList)? (When expression Do)? statement
  ;
action
  : Action (Identifier)? (When expression Do)? statement
  ;
statement
  :compound_statement
  |assignment_expression
  |postfix_expression
  |Return expressionRoot  
  |If expressionRoot Then s1=statement (Else s2=statement)? 
  |While expressionRoot Do statement 
  ;
  
expressionRoot
  : expression 
  ;
expression 
  : conditional_expression 
  ;
condtional_expression
  : relational_expression (('=='|'!=') relational_expression)?
  ;
relational_expression
  : additive_expression (('<'|'>'|'<='|'>=') additive_expression)*
  ;
additive_expression
  : postfix_expression (('+'|'-') postfix_expression)*
  ;
postive_expression
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
  : Identifier
  |String
  |Int
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
	:	LETTER (LETTER|'0'..'9')*
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
