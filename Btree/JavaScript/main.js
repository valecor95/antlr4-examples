var antlr4 = require('antlr4');
var BtreeLexer = require('./BtreeLexer').BtreeLexer;
var BtreeParser = require('./BtreeParser').BtreeParser;

var input = "(0(1()())(2()()))"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new BtreeLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Print the tokens readed
tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)

// Parser step
var parser = new BtreeParser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Print the parsing tree
if(tree.parser._syntaxErrors == 0){
    console.log("Parsing result = SUCCESS")
    console.log(tree.toStringTree(null, parser))
}
