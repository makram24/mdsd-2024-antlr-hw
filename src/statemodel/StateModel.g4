grammar StateModel;

// Starting rule
model: states transitions;

// States block
states: STATES LBRACE state+ RBRACE;
state: INITIAL? STATE_NAME LBRACE labels RBRACE ERROR?;
labels: (LABEL (COMMA LABEL)*)?;

// Transitions block
transitions: TRANSITIONS LBRACE transition* RBRACE;
transition: transScheme | transDefinition;
transScheme: TRANS (NORMAL | ERROR) ('n1'|'n2'|'e');
transDefinition: ('n1'|'n2'|'e') COLON STATE_NAME ARROW STATE_NAME;

// Lexer rules
STATES: 'states';
TRANSITIONS: 'transitions';
INITIAL: 'initial';
NORMAL: 'normal';
ERROR: 'error';
TRANS: 'trans';

LBRACE: '{';
RBRACE: '}';
COLON: ':';
ARROW: '->';
COMMA: ',';
SEMI: ';';

STATE_NAME: [A-Z][A-Z0-9]*;
LABEL: [a-z][a-z0-9]*;
TRANS_NAME: [a-z][a-z0-9]*;

WS: (' ' | '\t' | '\n' | '\r') -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;