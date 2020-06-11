import sys
from antlr4 import *
from BalParLexer import BalParLexer
from BalParParser import BalParParser
 
def main(argv):
    # Reads from file
    if(len(argv) <= 1):
        print("Usare: 'python3 main.py test-file")
        return;
        
    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = BalParLexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = BalParParser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))

if __name__ == '__main__':
    main(sys.argv)