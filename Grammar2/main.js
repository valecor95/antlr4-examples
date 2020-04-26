var antlr4 = require('antlr4');
var G1Lexer = require('./G2Lexer').G1Lexer;
var G1Parser = require('./G2Parser').G1Parser;
var G1Listener = require('./G2Listener').G1Listener;

var input = "aaabbbaaa"
var chars = new antlr4.InputStream(input);
var lexer = new G2Lexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);
var parser = new G2Parser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();