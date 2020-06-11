import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException{
    // Leggere input da file
    if(args.length == 0){
      System.out.println("Usare: 'java Main test'");
      return;
    }
    FileInputStream input_stream = new FileInputStream(args[0]);
    CharStream input = CharStreams.fromStream(input_stream); 
    
    // Creare l'oggetto Lexer
    BalPar2Lexer lexer = new BalPar2Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer); 

    // Print token letti
    tokens.fill();
    for(Token token : tokens.getTokens()){
        System.out.println(token.toString());
    }

    // Creare il parser ed eseguire il parsing
    BalPar2Parser parser = new BalPar2Parser(tokens);
    ParseTree tree = parser.parse_all();

    // Risultato del parsing e print del parse tree
    if(parser.getNumberOfSyntaxErrors() == 0){
      System.out.println("Parsing result = SUCCESS");
      // Print the parsing tree
      System.out.println(tree.toStringTree(parser));
    }
  }
}