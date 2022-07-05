lexer grammar MTLLexer;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

LBRACKET
    : '['
    ;

RBRACKET
    : ']'
    ;

LAND
    : '&&'
    ;

LOR
    : '||'
    ;

EQUI
    : '<==>'
    ;

IMPL
    : '==>'
    ;

UNTIL
    : 'U'
    ;

NEGATION
    : '!'
    ;

NEXT
    : 'X'
    ;

GLOBALLY
    : 'G'
    ;

FINALLY
    : 'F'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

ID
    : ([a-zA-Z0-9]|'_')+
    ;