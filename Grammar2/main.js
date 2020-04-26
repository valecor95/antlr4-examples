var antlr4 = require('antlr4');
var G1Lexer = require('./G2Lexer').G1Lexer;
var G1Parser = require('./G2Parser').G1Parser;
var G1Listener = require('./G2Listener').G1Listener;

var input = "aaabbbaaa"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new G2Lexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Uncomment to print the tokens readed
/*tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)*/

// Parser step
var parser = new G2Parser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Uncomment to print the parsing tree
// console.log(tree.toStringTree(null, parser))