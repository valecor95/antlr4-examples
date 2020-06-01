grammar Btree;

// Parser rule
parse_all:
    srule EOF;

srule   
    : '(' ')'
    | '(' KEY srule srule ')'
;

// Lexer rule
KEY: [0-9]+;
UNKNOWN_KEYWORD : .;