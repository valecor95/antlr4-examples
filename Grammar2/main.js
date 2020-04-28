var antlr4 = require('antlr4');
var G2Lexer = require('./G2Lexer').G2Lexer;
var G2Parser = require('./G2Parser').G2Parser;

var input = "aaabbbaaa"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new G2Lexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Print the tokens readed
tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)

// Parser step
var parser = new G2Parser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Print the parsing tree
if(tree.parser._syntaxErrors == 0){
    console.log("Parsing result = SUCCESS")
    console.log(tree.toStringTree(null, parser))
}