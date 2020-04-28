import sys
from antlr4 import *
from G1Lexer import G1Lexer
from G1Parser import G1Parser
 
def main(argv):
    # Reads from file
    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = G1Lexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Uncomment to print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = G1Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))
 
if __name__ == '__main__':
    main(sys.argv)