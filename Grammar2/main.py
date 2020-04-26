import sys
from antlr4 import *
from G2Lexer import G2Lexer
from G2Parser import G2Parser
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = G2Lexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = G2Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
 
if __name__ == '__main__':
    main(sys.argv)