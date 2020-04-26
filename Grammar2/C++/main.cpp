 #include <iostream>
#include <fstream>
#include <string>
#include "antlr4-runtime.h"
#include "G2Lexer.h"
#include "G2Parser.h"

using namespace antlr4;
using namespace std;

int main(int argc, const char* argv[]) {

  // Reads from file
	std::ifstream stream;                     // stream for input file
  stream.open(argv[1]);                     // open input file
  ANTLRInputStream input(stream);

  // Creates the Lexer
  G2Lexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  // Uncomment to print the tokens readed
  /*
  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }
  std::cout << "\n";
  */

  // Creates the Parser (parse_all is the starter rule)
  G2Parser parser(&tokens);
  tree::ParseTree *tree = parser.parse_all();
  std::cout << "\n";

  // Uncomment to print the parsing tree
  /*
  std::cout << tree->toStringTree(&parser) << std::endl;
  */

  return 0;
}