var antlr4 = require('antlr4');
var BalParLexer = require('./BalParLexer').BalParLexer;
var BalParParser = require('./BalParParser').BalParParser;

var input = "(()()())"
var chars = new antlr4.InputStream(input);

// Lexer step
var lexer = new BalParLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);

// Print the tokens readed
tokens.fill();
tokens.getTokens(0, input.length).forEach(token =>
    console.log(token.toString())
)

// Parser step
var parser = new BalParParser(tokens);
parser.buildParseTrees = true;
var tree = parser.parse_all();

// Print the parsing tree
if(tree.parser._syntaxErrors == 0){
    console.log("Parsing result = SUCCESS")
    console.log(tree.toStringTree(null, parser))
}