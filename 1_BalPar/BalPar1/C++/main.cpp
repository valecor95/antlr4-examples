#include <iostream>
#include <fstream>
#include <string>
#include "antlr4-runtime.h"
#include "BalParLexer.h"
#include "BalParParser.h"

using namespace antlr4;
using namespace std;

int main(int argc, const char* argv[]) {

  // Reads from file
	std::ifstream stream;                     // stream for input file
  stream.open(argv[1]);                     // open input file
  ANTLRInputStream input(stream);

  // Creates the Lexer
  BalParLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  // Uncomment to print the tokens readed
  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }
  std::cout << "\n";

  // Creates the Parser (parse_all is the starter rule)
  BalParParser parser(&tokens);
  tree::ParseTree *tree = parser.parse_all();

  if(parser.getNumberOfSyntaxErrors() == 0){
    std::cout << "Parsing result = SUCCESS" << std::endl;
    // Print the parsing tree
    std::cout << tree->toStringTree(&parser) << std::endl;
  }
  return 0;
}