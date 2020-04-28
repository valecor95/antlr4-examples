var antlr4 = require('antlr4');
var G1Lexer = require('./BtreeLexer').G1Lexer;
var G1Parser = require('./BtreeParser').G1Parser;
var G1Listener = require('./BtreeListener').G1Listener;

var input = "aaabbbaaa"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new BtreeLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Uncomment to print the tokens readed
/*tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)*/

// Parser step
var parser = new BtreeParser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Uncomment to print the parsing tree
// console.log(tree.toStringTree(null, parser))
