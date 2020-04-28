import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException{
    // Reads from file
    FileInputStream input_stream = new FileInputStream(args[0]);
    CharStream input = CharStreams.fromStream(input_stream); 
    
    // Creates the Lexer
    G2Lexer lexer = new G2Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer); 

    // Print the tokens readed
    tokens.fill();
    for(Token token : tokens.getTokens()){
        System.out.println(token.toString());
    }

    // Create the parser
    G2Parser parser = new G2Parser(tokens);
    ParseTree tree = parser.parse_all();

    if(parser.getNumberOfSyntaxErrors() == 0){
      System.out.println("Parsing result = SUCCESS");
      // Print the parsing tree
      System.out.println(tree.toStringTree(parser));
    }
  }
}