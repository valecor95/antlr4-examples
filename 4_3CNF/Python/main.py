import sys
from antlr4 import *
from CNF3Lexer import CNF3Lexer
from CNF3Parser import CNF3Parser
 
def main(argv):
    # Reads from file
    if(len(argv) <= 1):
        print("Usare: 'python3 main.py test-file")
        return;

    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = CNF3Lexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Uncomment to print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = CNF3Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))
 
if __name__ == '__main__':
    main(sys.argv)