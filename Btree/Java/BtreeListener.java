// Generated from Btree.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BtreeParser}.
 */
public interface BtreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BtreeParser#parse_all}.
	 * @param ctx the parse tree
	 */
	void enterParse_all(BtreeParser.Parse_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link BtreeParser#parse_all}.
	 * @param ctx the parse tree
	 */
	void exitParse_all(BtreeParser.Parse_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link BtreeParser#srule}.
	 * @param ctx the parse tree
	 */
	void enterSrule(BtreeParser.SruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BtreeParser#srule}.
	 * @param ctx the parse tree
	 */
	void exitSrule(BtreeParser.SruleContext ctx);
}