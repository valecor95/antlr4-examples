grammar BalPar2;

parse_all
    : srule EOF;

srule   
    :  '(' srule ')' srule
    | 
;

UNKNOWN_TOKEN: .;