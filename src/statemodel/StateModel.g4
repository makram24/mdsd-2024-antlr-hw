grammar StateModel;

// Parser rules
model: statesBlock transitionsBlock;

statesBlock: STATES LCURLY stateDefinition* RCURLY;

stateDefinition: ('initial')? ID ('{' labelList? '}')? ('error')? ';';

labelList: ID (',' ID)*;

transitionsBlock: 'transitions' '{' transitionDefinition* '}';

transitionDefinition: 'trans' ('normal' | 'error') ID ':' ID '->' ID ';';

// Lexer rules

STATES: 'states';
TRANSITIONS: 'transitions';

LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';
EOS: ';';
COMMA: ',';

EQ: '==';
NEQ: '!=';
NEG: '!';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
VAR: 'var';
MAIN: 'main';
RETURN: 'return';
VOID: 'void';

NULL : 'null';
TRUE: 'true';
FALSE: 'false';
STRING: '"' (~[\r\n"])* '"';
INT: [0-9]+;

ID: [a-zA-Z][a-zA-Z0-9_]*;
WS: (' '| '\t' | '\n' | '\r') -> skip;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
