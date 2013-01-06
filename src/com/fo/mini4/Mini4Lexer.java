// $ANTLR ANTLRVersion> Mini4Lexer.java generatedTimestamp>

package com.fo.mini4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mini4Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		BOOL=17, NIL=18, MUL=19, DIV=20, ADD=21, SUB=22, ID=23, INT=24, EQ=25, 
		NE=26, LT=27, LE=28, GT=29, GE=30, AND=31, OR=32, NOT=33, FLOAT=34, SL_COMMENT=35, 
		ML_COMMENT=36, Q_STRING=37, QQ_STRING=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'function'", "'.'", "','", "'print'", "'('", "'if'", "'return'", 
		"'='", "';'", "'def'", "'{'", "'else'", "'}'", "'println'", "'assert'", 
		"BOOL", "'nil'", "'*'", "'/'", "'+'", "'-'", "ID", "INT", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'!'", "FLOAT", "SL_COMMENT", 
		"ML_COMMENT", "Q_STRING", "QQ_STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "BOOL", 
		"NIL", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "EQ", "NE", "LT", "LE", 
		"GT", "GE", "AND", "OR", "NOT", "FLOAT", "SL_COMMENT", "ML_COMMENT", "Q_STRING", 
		"QQ_STRING", "WS", "EXPONENT", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};




	public Mini4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mini4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : T__15_action((RuleContext)_localctx, actionIndex); break;
			case 1 : T__14_action((RuleContext)_localctx, actionIndex); break;
			case 2 : T__13_action((RuleContext)_localctx, actionIndex); break;
			case 3 : T__12_action((RuleContext)_localctx, actionIndex); break;
			case 4 : T__11_action((RuleContext)_localctx, actionIndex); break;
			case 5 : T__10_action((RuleContext)_localctx, actionIndex); break;
			case 6 : T__9_action((RuleContext)_localctx, actionIndex); break;
			case 7 : T__8_action((RuleContext)_localctx, actionIndex); break;
			case 8 : T__7_action((RuleContext)_localctx, actionIndex); break;
			case 9 : T__6_action((RuleContext)_localctx, actionIndex); break;
			case 10 : T__5_action((RuleContext)_localctx, actionIndex); break;
			case 11 : T__4_action((RuleContext)_localctx, actionIndex); break;
			case 12 : T__3_action((RuleContext)_localctx, actionIndex); break;
			case 13 : T__2_action((RuleContext)_localctx, actionIndex); break;
			case 14 : T__1_action((RuleContext)_localctx, actionIndex); break;
			case 15 : T__0_action((RuleContext)_localctx, actionIndex); break;
			case 16 : BOOL_action((RuleContext)_localctx, actionIndex); break;
			case 17 : NIL_action((RuleContext)_localctx, actionIndex); break;
			case 18 : MUL_action((RuleContext)_localctx, actionIndex); break;
			case 19 : DIV_action((RuleContext)_localctx, actionIndex); break;
			case 20 : ADD_action((RuleContext)_localctx, actionIndex); break;
			case 21 : SUB_action((RuleContext)_localctx, actionIndex); break;
			case 22 : ID_action((RuleContext)_localctx, actionIndex); break;
			case 23 : INT_action((RuleContext)_localctx, actionIndex); break;
			case 24 : EQ_action((RuleContext)_localctx, actionIndex); break;
			case 25 : NE_action((RuleContext)_localctx, actionIndex); break;
			case 26 : LT_action((RuleContext)_localctx, actionIndex); break;
			case 27 : LE_action((RuleContext)_localctx, actionIndex); break;
			case 28 : GT_action((RuleContext)_localctx, actionIndex); break;
			case 29 : GE_action((RuleContext)_localctx, actionIndex); break;
			case 30 : AND_action((RuleContext)_localctx, actionIndex); break;
			case 31 : OR_action((RuleContext)_localctx, actionIndex); break;
			case 32 : NOT_action((RuleContext)_localctx, actionIndex); break;
			case 33 : FLOAT_action((RuleContext)_localctx, actionIndex); break;
			case 34 : SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;
			case 35 : ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
			case 36 : Q_STRING_action((RuleContext)_localctx, actionIndex); break;
			case 37 : QQ_STRING_action((RuleContext)_localctx, actionIndex); break;
			case 38 : WS_action((RuleContext)_localctx, actionIndex); break;
			case 39 : EXPONENT_action((RuleContext)_localctx, actionIndex); break;
			case 40 : HEX_DIGIT_action((RuleContext)_localctx, actionIndex); break;
			case 41 : ESC_SEQ_action((RuleContext)_localctx, actionIndex); break;
			case 42 : OCTAL_ESC_action((RuleContext)_localctx, actionIndex); break;
			case 43 : UNICODE_ESC_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void GE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void EXPONENT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void UNICODE_ESC_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void OCTAL_ESC_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void BOOL_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void HEX_DIGIT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void SUB_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void INT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NOT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void AND_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ID_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__9_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void MUL_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void QQ_STRING_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__8_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__7_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__6_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__5_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Q_STRING_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__4_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 1 : skip();  break;
		}
	}
	public void ESC_SEQ_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 2 : skip();  break;
		}
	}
	public void T__15_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NIL_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__12_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__11_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__14_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__13_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__1_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : skip();  break;
		}
	}
	public void OR_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__10_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__3_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__2_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void GT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void EQ_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void DIV_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ADD_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\'\u0150\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6"+
		"\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7"+
		"\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7"+
		"\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7"+
		"\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2%\7"+
		"%\2&\7&\2\'\7\'\2(\7(\2)\7)\2*\7*\2+\7+\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1"+
		"\1\1\1\1\1\1\1\1\2\1\2\1\3\1\3\1\4\1\4\1\4\1\4\1\4\1\4\1\5\1\5\1\6\1\6"+
		"\1\6\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\b\1\b\1\t\1\t\1\n\1\n\1\n\1\n\1\13"+
		"\1\13\1\f\1\f\1\f\1\f\1\f\1\r\1\r\1\16\1\16\1\16\1\16\1\16\1\16\1\16\1"+
		"\16\1\17\1\17\1\17\1\17\1\17\1\17\1\17\1\20\1\20\1\20\1\20\1\20\1\20\1"+
		"\20\1\20\1\20\3\20\u00a4\b\20\1\21\1\21\1\21\1\21\1\22\1\22\1\23\1\23"+
		"\1\24\1\24\1\25\1\25\1\26\1\26\5\26\u00b4\b\26\n\26\f\26\u00b7\t\26\1"+
		"\27\4\27\u00ba\b\27\13\27\f\27\u00bb\1\30\1\30\1\30\1\31\1\31\1\31\1\32"+
		"\1\32\1\33\1\33\1\33\1\34\1\34\1\35\1\35\1\35\1\36\1\36\1\36\1\37\1\37"+
		"\1\37\1 \1 \1!\4!\u00d7\b!\13!\f!\u00d8\1!\1!\5!\u00dd\b!\n!\f!\u00e0"+
		"\t!\1!\3!\u00e3\b!\1!\5!\u00e6\b!\n!\f!\u00e9\t!\1!\1!\4!\u00ed\b!\13"+
		"!\f!\u00ee\1!\3!\u00f2\b!\1!\4!\u00f5\b!\13!\f!\u00f6\1!\3!\u00fa\b!\1"+
		"\"\1\"\5\"\u00fe\b\"\n\"\f\"\u0101\t\"\1\"\1\"\1#\1#\1#\1#\5#\u0109\b"+
		"#\n#\f#\u010c\t#\1#\1#\1#\1#\1#\1$\1$\1$\5$\u0116\b$\n$\f$\u0119\t$\1"+
		"$\1$\1%\1%\1%\5%\u0120\b%\n%\f%\u0123\t%\1%\1%\1&\4&\u0128\b&\13&\f&\u0129"+
		"\1&\1&\1\'\1\'\3\'\u0130\b\'\1\'\4\'\u0133\b\'\13\'\f\'\u0134\1(\1(\1"+
		")\1)\1)\1)\3)\u013d\b)\1*\1*\1*\1*\1*\1*\1*\1*\1*\3*\u0148\b*\1+\1+\1"+
		"+\1+\1+\1+\1+,\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff\13\6"+
		"\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff\25\13\uffff\27\f\uffff"+
		"\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff!\21\uffff#\22\uffff%\23"+
		"\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff/\30\uffff\61\31\uffff"+
		"\63\32\uffff\65\33\uffff\67\34\uffff9\35\uffff;\36\uffff=\37\uffff? \uffff"+
		"A!\uffffC\"\uffffE#\0G$\1I%\uffffK&\uffffM\'\2O\0\uffffQ\0\uffffS\0\uffff"+
		"U\0\uffffW\0\uffff\1\0\f\3AZ__az\4\609AZ__az\1\609\2\n\n\r\r\1\uffff\uffff"+
		"\2\'\'\\\\\2\"\"\\\\\3\t\n\r\r  \2EEee\2++--\3\609AFaf\b\"\"\'\'\\\\b"+
		"bffnnrrtt\u0163\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1"+
		"\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0"+
		"\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37"+
		"\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1"+
		"\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0\0"+
		"\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1\0\0\0\0C"+
		"\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\0K\1\0\0\0\0M\1\0\0\0\1Y\1\0"+
		"\0\0\3[\1\0\0\0\5d\1\0\0\0\7f\1\0\0\0\th\1\0\0\0\13n\1\0\0\0\rp\1\0\0"+
		"\0\17s\1\0\0\0\21z\1\0\0\0\23|\1\0\0\0\25~\1\0\0\0\27\u0082\1\0\0\0\31"+
		"\u0084\1\0\0\0\33\u0089\1\0\0\0\35\u008b\1\0\0\0\37\u0093\1\0\0\0!\u00a3"+
		"\1\0\0\0#\u00a5\1\0\0\0%\u00a9\1\0\0\0\'\u00ab\1\0\0\0)\u00ad\1\0\0\0"+
		"+\u00af\1\0\0\0-\u00b1\1\0\0\0/\u00b9\1\0\0\0\61\u00bd\1\0\0\0\63\u00c0"+
		"\1\0\0\0\65\u00c3\1\0\0\0\67\u00c5\1\0\0\09\u00c8\1\0\0\0;\u00ca\1\0\0"+
		"\0=\u00cd\1\0\0\0?\u00d0\1\0\0\0A\u00d3\1\0\0\0C\u00f9\1\0\0\0E\u00fb"+
		"\1\0\0\0G\u0104\1\0\0\0I\u0112\1\0\0\0K\u011c\1\0\0\0M\u0127\1\0\0\0O"+
		"\u012d\1\0\0\0Q\u0136\1\0\0\0S\u013c\1\0\0\0U\u0147\1\0\0\0W\u0149\1\0"+
		"\0\0YZ\5)\0\0Z\2\1\0\0\0[\\\5f\0\0\\]\5u\0\0]^\5n\0\0^_\5c\0\0_`\5t\0"+
		"\0`a\5i\0\0ab\5o\0\0bc\5n\0\0c\4\1\0\0\0de\5.\0\0e\6\1\0\0\0fg\5,\0\0"+
		"g\b\1\0\0\0hi\5p\0\0ij\5r\0\0jk\5i\0\0kl\5n\0\0lm\5t\0\0m\n\1\0\0\0no"+
		"\5(\0\0o\f\1\0\0\0pq\5i\0\0qr\5f\0\0r\16\1\0\0\0st\5r\0\0tu\5e\0\0uv\5"+
		"t\0\0vw\5u\0\0wx\5r\0\0xy\5n\0\0y\20\1\0\0\0z{\5=\0\0{\22\1\0\0\0|}\5"+
		";\0\0}\24\1\0\0\0~\177\5d\0\0\177\u0080\5e\0\0\u0080\u0081\5f\0\0\u0081"+
		"\26\1\0\0\0\u0082\u0083\5{\0\0\u0083\30\1\0\0\0\u0084\u0085\5e\0\0\u0085"+
		"\u0086\5l\0\0\u0086\u0087\5s\0\0\u0087\u0088\5e\0\0\u0088\32\1\0\0\0\u0089"+
		"\u008a\5}\0\0\u008a\34\1\0\0\0\u008b\u008c\5p\0\0\u008c\u008d\5r\0\0\u008d"+
		"\u008e\5i\0\0\u008e\u008f\5n\0\0\u008f\u0090\5t\0\0\u0090\u0091\5l\0\0"+
		"\u0091\u0092\5n\0\0\u0092\36\1\0\0\0\u0093\u0094\5a\0\0\u0094\u0095\5"+
		"s\0\0\u0095\u0096\5s\0\0\u0096\u0097\5e\0\0\u0097\u0098\5r\0\0\u0098\u0099"+
		"\5t\0\0\u0099 \1\0\0\0\u009a\u009b\5t\0\0\u009b\u009c\5r\0\0\u009c\u009d"+
		"\5u\0\0\u009d\u00a4\5e\0\0\u009e\u009f\5f\0\0\u009f\u00a0\5a\0\0\u00a0"+
		"\u00a1\5l\0\0\u00a1\u00a2\5s\0\0\u00a2\u00a4\5e\0\0\u00a3\u009a\1\0\0"+
		"\0\u00a3\u009e\1\0\0\0\u00a4\"\1\0\0\0\u00a5\u00a6\5n\0\0\u00a6\u00a7"+
		"\5i\0\0\u00a7\u00a8\5l\0\0\u00a8$\1\0\0\0\u00a9\u00aa\5*\0\0\u00aa&\1"+
		"\0\0\0\u00ab\u00ac\5/\0\0\u00ac(\1\0\0\0\u00ad\u00ae\5+\0\0\u00ae*\1\0"+
		"\0\0\u00af\u00b0\5-\0\0\u00b0,\1\0\0\0\u00b1\u00b5\7\0\0\0\u00b2\u00b4"+
		"\7\1\0\0\u00b3\u00b2\1\0\0\0\u00b4\u00b7\1\0\0\0\u00b5\u00b3\1\0\0\0\u00b5"+
		"\u00b6\1\0\0\0\u00b6.\1\0\0\0\u00b7\u00b5\1\0\0\0\u00b8\u00ba\7\2\0\0"+
		"\u00b9\u00b8\1\0\0\0\u00ba\u00bb\1\0\0\0\u00bb\u00b9\1\0\0\0\u00bb\u00bc"+
		"\1\0\0\0\u00bc\60\1\0\0\0\u00bd\u00be\5=\0\0\u00be\u00bf\5=\0\0\u00bf"+
		"\62\1\0\0\0\u00c0\u00c1\5!\0\0\u00c1\u00c2\5=\0\0\u00c2\64\1\0\0\0\u00c3"+
		"\u00c4\5<\0\0\u00c4\66\1\0\0\0\u00c5\u00c6\5<\0\0\u00c6\u00c7\5=\0\0\u00c7"+
		"8\1\0\0\0\u00c8\u00c9\5>\0\0\u00c9:\1\0\0\0\u00ca\u00cb\5>\0\0\u00cb\u00cc"+
		"\5=\0\0\u00cc<\1\0\0\0\u00cd\u00ce\5&\0\0\u00ce\u00cf\5&\0\0\u00cf>\1"+
		"\0\0\0\u00d0\u00d1\5|\0\0\u00d1\u00d2\5|\0\0\u00d2@\1\0\0\0\u00d3\u00d4"+
		"\5!\0\0\u00d4B\1\0\0\0\u00d5\u00d7\2\609\0\u00d6\u00d5\1\0\0\0\u00d7\u00d8"+
		"\1\0\0\0\u00d8\u00d6\1\0\0\0\u00d8\u00d9\1\0\0\0\u00d9\u00da\1\0\0\0\u00da"+
		"\u00de\5.\0\0\u00db\u00dd\2\609\0\u00dc\u00db\1\0\0\0\u00dd\u00e0\1\0"+
		"\0\0\u00de\u00dc\1\0\0\0\u00de\u00df\1\0\0\0\u00df\u00e2\1\0\0\0\u00e0"+
		"\u00de\1\0\0\0\u00e1\u00e3\3O\'\0\u00e2\u00e1\1\0\0\0\u00e2\u00e3\1\0"+
		"\0\0\u00e3\u00fa\1\0\0\0\u00e4\u00e6\2\609\0\u00e5\u00e4\1\0\0\0\u00e6"+
		"\u00e9\1\0\0\0\u00e7\u00e5\1\0\0\0\u00e7\u00e8\1\0\0\0\u00e8\u00ea\1\0"+
		"\0\0\u00e9\u00e7\1\0\0\0\u00ea\u00ec\5.\0\0\u00eb\u00ed\2\609\0\u00ec"+
		"\u00eb\1\0\0\0\u00ed\u00ee\1\0\0\0\u00ee\u00ec\1\0\0\0\u00ee\u00ef\1\0"+
		"\0\0\u00ef\u00f1\1\0\0\0\u00f0\u00f2\3O\'\0\u00f1\u00f0\1\0\0\0\u00f1"+
		"\u00f2\1\0\0\0\u00f2\u00fa\1\0\0\0\u00f3\u00f5\2\609\0\u00f4\u00f3\1\0"+
		"\0\0\u00f5\u00f6\1\0\0\0\u00f6\u00f4\1\0\0\0\u00f6\u00f7\1\0\0\0\u00f7"+
		"\u00f8\1\0\0\0\u00f8\u00fa\3O\'\0\u00f9\u00d6\1\0\0\0\u00f9\u00e7\1\0"+
		"\0\0\u00f9\u00f4\1\0\0\0\u00faD\1\0\0\0\u00fb\u00ff\5#\0\0\u00fc\u00fe"+
		"\b\3\0\0\u00fd\u00fc\1\0\0\0\u00fe\u0101\1\0\0\0\u00ff\u00fd\1\0\0\0\u00ff"+
		"\u0100\1\0\0\0\u0100\u0102\1\0\0\0\u0101\u00ff\1\0\0\0\u0102\u0103\6\""+
		"\0\0\u0103F\1\0\0\0\u0104\u0105\5/\0\0\u0105\u0106\5*\0\0\u0106\u010a"+
		"\1\0\0\0\u0107\u0109\b\4\0\0\u0108\u0107\1\0\0\0\u0109\u010c\1\0\0\0\u010a"+
		"\u0108\1\0\0\0\u010a\u010b\1\0\0\0\u010b\u010d\1\0\0\0\u010c\u010a\1\0"+
		"\0\0\u010d\u010e\5*\0\0\u010e\u010f\5/\0\0\u010f\u0110\1\0\0\0\u0110\u0111"+
		"\6#\1\0\u0111H\1\0\0\0\u0112\u0117\5\'\0\0\u0113\u0116\3S)\0\u0114\u0116"+
		"\b\5\0\0\u0115\u0113\1\0\0\0\u0115\u0114\1\0\0\0\u0116\u0119\1\0\0\0\u0117"+
		"\u0115\1\0\0\0\u0117\u0118\1\0\0\0\u0118\u011a\1\0\0\0\u0119\u0117\1\0"+
		"\0\0\u011a\u011b\5\'\0\0\u011bJ\1\0\0\0\u011c\u0121\5\"\0\0\u011d\u0120"+
		"\3S)\0\u011e\u0120\b\6\0\0\u011f\u011d\1\0\0\0\u011f\u011e\1\0\0\0\u0120"+
		"\u0123\1\0\0\0\u0121\u011f\1\0\0\0\u0121\u0122\1\0\0\0\u0122\u0124\1\0"+
		"\0\0\u0123\u0121\1\0\0\0\u0124\u0125\5\"\0\0\u0125L\1\0\0\0\u0126\u0128"+
		"\7\7\0\0\u0127\u0126\1\0\0\0\u0128\u0129\1\0\0\0\u0129\u0127\1\0\0\0\u0129"+
		"\u012a\1\0\0\0\u012a\u012b\1\0\0\0\u012b\u012c\6&\2\0\u012cN\1\0\0\0\u012d"+
		"\u012f\7\b\0\0\u012e\u0130\7\t\0\0\u012f\u012e\1\0\0\0\u012f\u0130\1\0"+
		"\0\0\u0130\u0132\1\0\0\0\u0131\u0133\2\609\0\u0132\u0131\1\0\0\0\u0133"+
		"\u0134\1\0\0\0\u0134\u0132\1\0\0\0\u0134\u0135\1\0\0\0\u0135P\1\0\0\0"+
		"\u0136\u0137\7\n\0\0\u0137R\1\0\0\0\u0138\u0139\5\\\0\0\u0139\u013d\7"+
		"\13\0\0\u013a\u013d\3W+\0\u013b\u013d\3U*\0\u013c\u0138\1\0\0\0\u013c"+
		"\u013a\1\0\0\0\u013c\u013b\1\0\0\0\u013dT\1\0\0\0\u013e\u013f\5\\\0\0"+
		"\u013f\u0140\2\60\63\0\u0140\u0141\2\60\67\0\u0141\u0148\2\60\67\0\u0142"+
		"\u0143\5\\\0\0\u0143\u0144\2\60\67\0\u0144\u0148\2\60\67\0\u0145\u0146"+
		"\5\\\0\0\u0146\u0148\2\60\67\0\u0147\u013e\1\0\0\0\u0147\u0142\1\0\0\0"+
		"\u0147\u0145\1\0\0\0\u0148V\1\0\0\0\u0149\u014a\5\\\0\0\u014a\u014b\5"+
		"u\0\0\u014b\u014c\3Q(\0\u014c\u014d\3Q(\0\u014d\u014e\3Q(\0\u014e\u014f"+
		"\3Q(\0\u014fX\1\0\0\0\27\0\u00a3\u00b5\u00bb\u00d8\u00de\u00e2\u00e7\u00ee"+
		"\u00f1\u00f6\u00f9\u00ff\u010a\u0115\u0117\u011f\u0121\u0129\u012f\u0134"+
		"\u013c\u0147";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}