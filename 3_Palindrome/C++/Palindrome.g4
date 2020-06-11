grammar Palindrome;

parse_all:
    srule EOF;

srule   
    : 'a' srule 'a'
    | 'b' srule 'b'
    | 'a' 'a'
    | 'b' 'b'
    | 'a'
    | 'b';