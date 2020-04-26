grammar G2;

parse_all
    : srule EOF;

srule   
    :  '(' srule ')'
    | srule srule
    | '(' ')';

/* LL1
assioma   
    :  '(' term ')' term;

term
    : '(' term ')' term
    | ;
*/