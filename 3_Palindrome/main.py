import sys
from antlr4 import *
from PalindromeLexer import PalindromeLexer
from PalindromeParser import PalindromeParser
 
def main(argv):
    # Reads from file
    if(len(argv) <= 1):
        print("Usare: 'python3 main.py test-file")
        return;
        
    input_stream = FileStream(argv[1])

    # Lexer step
    lexer = PalindromeLexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Uncomment to print the tokens readed
    stream.fill()
    for token in stream.getTokens(0, input_stream.size):
        print(str(token))

    # Parser step
    parser = PalindromeParser(stream)
    tree = parser.parse_all()
    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")
        # Print the parsing tree
        print(tree.toStringTree(None, parser))
 
if __name__ == '__main__':
    main(sys.argv)