grammar Hello;

startrule   : 'hello' ID;

ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;