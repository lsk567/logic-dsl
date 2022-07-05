parser grammar MTLParser;

options { tokenVocab=MTLLexer; }

mtl
    : equivalence
    ;

equivalence
    : left=implication ( EQUI right=implication )?
    ;

implication
    : left=disjunction ( IMPL right=disjunction )?
    ;

disjunction
    : terms+=conjunction ( LOR terms+=conjunction )*
    ;

conjunction
    : terms+=binaryOp ( LAND terms+=binaryOp )*
    ;

binaryOp
    : left=unaryOp (UNTIL right=unaryOp)?
    ;

unaryOp
    : formula=primary # NoUnaryOp
    | NEGATION formula=primary # Negation
    | NEXT formula=primary # Next
    | GLOBALLY formula=primary # Globally
    | FINALLY formula=primary # Finally
    ;

primary
    : atom=atomicProp
    | id=ID
    | LPAREN formula=mtl RPAREN
    ;

atomicProp
    : primitive=TRUE
    | primitive=FALSE
    ;