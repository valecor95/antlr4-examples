import sys
from antlr4 import *
from BalPar2Lexer import BalPar2Lexer
from BalPar2Parser import BalPar2Parser
 
def main(argv):
    # Reads from file
    if(len(argv) <= 1):
        print("Usare: 'python3 main.py test-file")
        return;
        
    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = BalPar2Lexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = BalPar2Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))

if __name__ == '__main__':
    main(sys.argv)