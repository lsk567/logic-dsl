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

WS
    :  [ \t\r\n]+ -> skip
    ;

ID
    : ([a-zA-Z0-9]|'_')+
    ;