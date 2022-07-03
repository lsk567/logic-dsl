parser grammar MTLParser;

options { tokenVocab=MTLLexer; }

formula
    : disjunction
    ;

disjunction
    : terms+=conjunction ( LOR terms+=conjunction )*
    ;

conjunction
    : terms+=ID ( LAND terms+=ID )*
    ;