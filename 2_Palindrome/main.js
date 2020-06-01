var antlr4 = require('antlr4');
var G1Lexer = require('./G1Lexer').G1Lexer;
var G1Parser = require('./G1Parser').G1Parser;

var input = "aaabbbaaa"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new G1Lexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Uncomment to print the tokens readed
tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)

// Parser step
var parser = new G1Parser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Print the parsing tree
if(tree.parser._syntaxErrors == 0){
    console.log("Parsing result = SUCCESS")
    console.log(tree.toStringTree(null, parser))
}
