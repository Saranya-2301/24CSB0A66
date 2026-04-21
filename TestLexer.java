// Generated from Test.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, ASSIGN=3, PLUS=4, MINUS=5, MUL=6, DIV=7, REL_OP=8, LPAREN=9, 
		RPAREN=10, LBRACE=11, RBRACE=12, SEMI=13, ID=14, NUMBER=15, LINE_COMMENT=16, 
		BLOCK_COMMENT=17, WS=18, ERROR_CHAR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "WHILE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "REL_OP", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMI", "ID", "NUMBER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS", "ERROR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'='", "'+'", "'-'", "'*'", "'/'", null, "'('", 
			"')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "REL_OP", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "ID", "NUMBER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS", "ERROR_CHAR"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007D\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rR\b\r"+
		"\n\r\f\rU\t\r\u0001\u000e\u0004\u000eX\b\u000e\u000b\u000e\f\u000eY\u0001"+
		"\u000e\u0001\u000e\u0004\u000e^\b\u000e\u000b\u000e\f\u000e_\u0003\u000e"+
		"b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"h\b\u000f\n\u000f\f\u000fk\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010s\b\u0010\n\u0010\f\u0010"+
		"v\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0004\u0011~\b\u0011\u000b\u0011\f\u0011\u007f\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001t\u0000\u0013\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\u0001\u0000\u0006\u0002\u0000<<>>\u0003\u0000AZ"+
		"__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u008f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003*\u0001"+
		"\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000"+
		"\u0000\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r8\u0001"+
		"\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000"+
		"\u0000\u0013G\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017"+
		"K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bO\u0001"+
		"\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000"+
		"\u0000!n\u0001\u0000\u0000\u0000#}\u0001\u0000\u0000\u0000%\u0083\u0001"+
		"\u0000\u0000\u0000\'(\u0005i\u0000\u0000()\u0005f\u0000\u0000)\u0002\u0001"+
		"\u0000\u0000\u0000*+\u0005w\u0000\u0000+,\u0005h\u0000\u0000,-\u0005i"+
		"\u0000\u0000-.\u0005l\u0000\u0000./\u0005e\u0000\u0000/\u0004\u0001\u0000"+
		"\u0000\u000001\u0005=\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005"+
		"+\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005-\u0000\u00005\n\u0001"+
		"\u0000\u0000\u000067\u0005*\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005"+
		"/\u0000\u00009\u000e\u0001\u0000\u0000\u0000:;\u0005<\u0000\u0000;D\u0005"+
		"=\u0000\u0000<=\u0005>\u0000\u0000=D\u0005=\u0000\u0000>?\u0005=\u0000"+
		"\u0000?D\u0005=\u0000\u0000@A\u0005!\u0000\u0000AD\u0005=\u0000\u0000"+
		"BD\u0007\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000"+
		"\u0000C>\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005(\u0000\u0000F\u0012"+
		"\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u0014\u0001\u0000\u0000"+
		"\u0000IJ\u0005{\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005}\u0000"+
		"\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005;\u0000\u0000N\u001a\u0001"+
		"\u0000\u0000\u0000OS\u0007\u0001\u0000\u0000PR\u0007\u0002\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\u001c\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VX\u0007\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Za\u0001\u0000\u0000\u0000[]\u0005.\u0000\u0000\\^\u0007\u0003\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a[\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u001e\u0001\u0000\u0000"+
		"\u0000cd\u0005/\u0000\u0000de\u0005/\u0000\u0000ei\u0001\u0000\u0000\u0000"+
		"fh\b\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0006\u000f\u0000\u0000m \u0001\u0000"+
		"\u0000\u0000no\u0005/\u0000\u0000op\u0005*\u0000\u0000pt\u0001\u0000\u0000"+
		"\u0000qs\t\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005*\u0000\u0000xy\u0005/\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u0010\u0000\u0000{\"\u0001\u0000"+
		"\u0000\u0000|~\u0007\u0005\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006"+
		"\u0011\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0084\t\u0000"+
		"\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\t\u0000CSY_ait\u007f\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}