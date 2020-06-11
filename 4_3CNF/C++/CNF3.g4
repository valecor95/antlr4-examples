grammar CNF3;

//Regole del Parser
parse_all:
    srule EOF
;

srule   
    : srule AND crule
    | crule
;

crule
    :
    | '(' lrule OR lrule OR lrule ')'
;

lrule
    : ID
    | NOT ID
;

// Regole del Lexer 
AND: '&&';
OR: '||';
NOT: '!';
ID: [A-Za-z]+;
WS: [ \t\n\r]+ -> skip;
UNKNOWN_TOKEN: .;