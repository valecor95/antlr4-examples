// Generated from Btree.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BtreeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KEY=3, UNKNOWN_KEYWORD=4;
	public static final int
		RULE_parse_all = 0, RULE_srule = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse_all", "srule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "KEY", "UNKNOWN_KEYWORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Btree.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BtreeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Parse_allContext extends ParserRuleContext {
		public SruleContext srule() {
			return getRuleContext(SruleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BtreeParser.EOF, 0); }
		public Parse_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BtreeListener ) ((BtreeListener)listener).enterParse_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BtreeListener ) ((BtreeListener)listener).exitParse_all(this);
		}
	}

	public final Parse_allContext parse_all() throws RecognitionException {
		Parse_allContext _localctx = new Parse_allContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			srule();
			setState(5);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SruleContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(BtreeParser.KEY, 0); }
		public List<SruleContext> srule() {
			return getRuleContexts(SruleContext.class);
		}
		public SruleContext srule(int i) {
			return getRuleContext(SruleContext.class,i);
		}
		public SruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BtreeListener ) ((BtreeListener)listener).enterSrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BtreeListener ) ((BtreeListener)listener).exitSrule(this);
		}
	}

	public final SruleContext srule() throws RecognitionException {
		SruleContext _localctx = new SruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_srule);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(T__0);
				setState(8);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(T__0);
				setState(10);
				match(KEY);
				setState(11);
				srule();
				setState(12);
				srule();
				setState(13);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\22\n\3\3\3\2\2\4"+
		"\2\4\2\2\2\22\2\6\3\2\2\2\4\21\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2"+
		"\2\2\t\n\7\3\2\2\n\22\7\4\2\2\13\f\7\3\2\2\f\r\7\5\2\2\r\16\5\4\3\2\16"+
		"\17\5\4\3\2\17\20\7\4\2\2\20\22\3\2\2\2\21\t\3\2\2\2\21\13\3\2\2\2\22"+
		"\5\3\2\2\2\3\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}