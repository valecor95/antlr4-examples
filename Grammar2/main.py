import sys
from antlr4 import *
from G2Lexer import G2Lexer
from G2Parser import G2Parser
 
def main(argv):
    # Reads from file
    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = G2Lexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = G2Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))

if __name__ == '__main__':
    main(sys.argv)