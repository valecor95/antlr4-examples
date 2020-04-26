import sys
from antlr4 import *
from G1Lexer import G1Lexer
from G1Parser import G1Parser
from G1Listener import G1Listener
from KeyPrinter import KeyPrinter
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = G1Lexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = G1Parser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
 
if __name__ == '__main__':
    main(sys.argv)