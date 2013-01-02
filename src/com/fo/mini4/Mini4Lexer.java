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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BOOL=15, NIL=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, ID=21, INT=22, EQ=23, NE=24, LT=25, LE=26, GT=27, 
		GE=28, AND=29, OR=30, NOT=31, FLOAT=32, SL_COMMENT=33, ML_COMMENT=34, 
		Q_STRING=35, QQ_STRING=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'function'", "'.'", "','", "'print'", "'('", "'return'", "'='", 
		"';'", "'def'", "'{'", "'}'", "'println'", "'assert'", "BOOL", "'nil'", 
		"'*'", "'/'", "'+'", "'-'", "ID", "INT", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'&&'", "'||'", "'!'", "FLOAT", "SL_COMMENT", "ML_COMMENT", 
		"Q_STRING", "QQ_STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "BOOL", "NIL", "MUL", "DIV", "ADD", 
		"SUB", "ID", "INT", "EQ", "NE", "LT", "LE", "GT", "GE", "AND", "OR", "NOT", 
		"FLOAT", "SL_COMMENT", "ML_COMMENT", "Q_STRING", "QQ_STRING", "WS", "EXPONENT", 
		"HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
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
			case 0 : T__13_action((RuleContext)_localctx, actionIndex); break;
			case 1 : T__12_action((RuleContext)_localctx, actionIndex); break;
			case 2 : T__11_action((RuleContext)_localctx, actionIndex); break;
			case 3 : T__10_action((RuleContext)_localctx, actionIndex); break;
			case 4 : T__9_action((RuleContext)_localctx, actionIndex); break;
			case 5 : T__8_action((RuleContext)_localctx, actionIndex); break;
			case 6 : T__7_action((RuleContext)_localctx, actionIndex); break;
			case 7 : T__6_action((RuleContext)_localctx, actionIndex); break;
			case 8 : T__5_action((RuleContext)_localctx, actionIndex); break;
			case 9 : T__4_action((RuleContext)_localctx, actionIndex); break;
			case 10 : T__3_action((RuleContext)_localctx, actionIndex); break;
			case 11 : T__2_action((RuleContext)_localctx, actionIndex); break;
			case 12 : T__1_action((RuleContext)_localctx, actionIndex); break;
			case 13 : T__0_action((RuleContext)_localctx, actionIndex); break;
			case 14 : BOOL_action((RuleContext)_localctx, actionIndex); break;
			case 15 : NIL_action((RuleContext)_localctx, actionIndex); break;
			case 16 : MUL_action((RuleContext)_localctx, actionIndex); break;
			case 17 : DIV_action((RuleContext)_localctx, actionIndex); break;
			case 18 : ADD_action((RuleContext)_localctx, actionIndex); break;
			case 19 : SUB_action((RuleContext)_localctx, actionIndex); break;
			case 20 : ID_action((RuleContext)_localctx, actionIndex); break;
			case 21 : INT_action((RuleContext)_localctx, actionIndex); break;
			case 22 : EQ_action((RuleContext)_localctx, actionIndex); break;
			case 23 : NE_action((RuleContext)_localctx, actionIndex); break;
			case 24 : LT_action((RuleContext)_localctx, actionIndex); break;
			case 25 : LE_action((RuleContext)_localctx, actionIndex); break;
			case 26 : GT_action((RuleContext)_localctx, actionIndex); break;
			case 27 : GE_action((RuleContext)_localctx, actionIndex); break;
			case 28 : AND_action((RuleContext)_localctx, actionIndex); break;
			case 29 : OR_action((RuleContext)_localctx, actionIndex); break;
			case 30 : NOT_action((RuleContext)_localctx, actionIndex); break;
			case 31 : FLOAT_action((RuleContext)_localctx, actionIndex); break;
			case 32 : SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;
			case 33 : ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
			case 34 : Q_STRING_action((RuleContext)_localctx, actionIndex); break;
			case 35 : QQ_STRING_action((RuleContext)_localctx, actionIndex); break;
			case 36 : WS_action((RuleContext)_localctx, actionIndex); break;
			case 37 : EXPONENT_action((RuleContext)_localctx, actionIndex); break;
			case 38 : HEX_DIGIT_action((RuleContext)_localctx, actionIndex); break;
			case 39 : ESC_SEQ_action((RuleContext)_localctx, actionIndex); break;
			case 40 : OCTAL_ESC_action((RuleContext)_localctx, actionIndex); break;
			case 41 : UNICODE_ESC_action((RuleContext)_localctx, actionIndex); break;
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
	public void T__3_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__10_action(RuleContext _localctx, int actionIndex) {
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
	public void DIV_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void EQ_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ADD_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NE_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2%\u0144\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6"+
		"\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7"+
		"\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7"+
		"\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7"+
		"\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2%\7"+
		"%\2&\7&\2\'\7\'\2(\7(\2)\7)\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1"+
		"\1\1\2\1\2\1\3\1\3\1\4\1\4\1\4\1\4\1\4\1\4\1\5\1\5\1\6\1\6\1\6\1\6\1\6"+
		"\1\6\1\6\1\7\1\7\1\b\1\b\1\t\1\t\1\t\1\t\1\n\1\n\1\13\1\13\1\f\1\f\1\f"+
		"\1\f\1\f\1\f\1\f\1\f\1\r\1\r\1\r\1\r\1\r\1\r\1\r\1\16\1\16\1\16\1\16\1"+
		"\16\1\16\1\16\1\16\1\16\3\16\u0098\b\16\1\17\1\17\1\17\1\17\1\20\1\20"+
		"\1\21\1\21\1\22\1\22\1\23\1\23\1\24\1\24\5\24\u00a8\b\24\n\24\f\24\u00ab"+
		"\t\24\1\25\4\25\u00ae\b\25\13\25\f\25\u00af\1\26\1\26\1\26\1\27\1\27\1"+
		"\27\1\30\1\30\1\31\1\31\1\31\1\32\1\32\1\33\1\33\1\33\1\34\1\34\1\34\1"+
		"\35\1\35\1\35\1\36\1\36\1\37\4\37\u00cb\b\37\13\37\f\37\u00cc\1\37\1\37"+
		"\5\37\u00d1\b\37\n\37\f\37\u00d4\t\37\1\37\3\37\u00d7\b\37\1\37\5\37\u00da"+
		"\b\37\n\37\f\37\u00dd\t\37\1\37\1\37\4\37\u00e1\b\37\13\37\f\37\u00e2"+
		"\1\37\3\37\u00e6\b\37\1\37\4\37\u00e9\b\37\13\37\f\37\u00ea\1\37\3\37"+
		"\u00ee\b\37\1 \1 \5 \u00f2\b \n \f \u00f5\t \1 \1 \1!\1!\1!\1!\5!\u00fd"+
		"\b!\n!\f!\u0100\t!\1!\1!\1!\1!\1!\1\"\1\"\1\"\5\"\u010a\b\"\n\"\f\"\u010d"+
		"\t\"\1\"\1\"\1#\1#\1#\5#\u0114\b#\n#\f#\u0117\t#\1#\1#\1$\4$\u011c\b$"+
		"\13$\f$\u011d\1$\1$\1%\1%\3%\u0124\b%\1%\4%\u0127\b%\13%\f%\u0128\1&\1"+
		"&\1\'\1\'\1\'\1\'\3\'\u0131\b\'\1(\1(\1(\1(\1(\1(\1(\1(\1(\3(\u013c\b"+
		"(\1)\1)\1)\1)\1)\1)\1)*\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff"+
		"\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff\25\13\uffff\27"+
		"\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff!\21\uffff#\22"+
		"\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff/\30\uffff\61"+
		"\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9\35\uffff;\36\uffff=\37"+
		"\uffff? \uffffA!\0C\"\1E#\uffffG$\uffffI%\2K\0\uffffM\0\uffffO\0\uffff"+
		"Q\0\uffffS\0\uffff\1\0\f\3AZ__az\4\609AZ__az\1\609\2\n\n\r\r\1\uffff\uffff"+
		"\2\'\'\\\\\2\"\"\\\\\3\t\n\r\r  \2EEee\2++--\3\609AFaf\b\"\"\'\'\\\\b"+
		"bffnnrrtt\u0157\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1"+
		"\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0"+
		"\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37"+
		"\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1"+
		"\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0\0"+
		"\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1\0\0\0\0C"+
		"\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\1U\1\0\0\0\3W\1\0\0\0\5`\1\0"+
		"\0\0\7b\1\0\0\0\td\1\0\0\0\13j\1\0\0\0\rl\1\0\0\0\17s\1\0\0\0\21u\1\0"+
		"\0\0\23w\1\0\0\0\25{\1\0\0\0\27}\1\0\0\0\31\177\1\0\0\0\33\u0087\1\0\0"+
		"\0\35\u0097\1\0\0\0\37\u0099\1\0\0\0!\u009d\1\0\0\0#\u009f\1\0\0\0%\u00a1"+
		"\1\0\0\0\'\u00a3\1\0\0\0)\u00a5\1\0\0\0+\u00ad\1\0\0\0-\u00b1\1\0\0\0"+
		"/\u00b4\1\0\0\0\61\u00b7\1\0\0\0\63\u00b9\1\0\0\0\65\u00bc\1\0\0\0\67"+
		"\u00be\1\0\0\09\u00c1\1\0\0\0;\u00c4\1\0\0\0=\u00c7\1\0\0\0?\u00ed\1\0"+
		"\0\0A\u00ef\1\0\0\0C\u00f8\1\0\0\0E\u0106\1\0\0\0G\u0110\1\0\0\0I\u011b"+
		"\1\0\0\0K\u0121\1\0\0\0M\u012a\1\0\0\0O\u0130\1\0\0\0Q\u013b\1\0\0\0S"+
		"\u013d\1\0\0\0UV\5)\0\0V\2\1\0\0\0WX\5f\0\0XY\5u\0\0YZ\5n\0\0Z[\5c\0\0"+
		"[\\\5t\0\0\\]\5i\0\0]^\5o\0\0^_\5n\0\0_\4\1\0\0\0`a\5.\0\0a\6\1\0\0\0"+
		"bc\5,\0\0c\b\1\0\0\0de\5p\0\0ef\5r\0\0fg\5i\0\0gh\5n\0\0hi\5t\0\0i\n\1"+
		"\0\0\0jk\5(\0\0k\f\1\0\0\0lm\5r\0\0mn\5e\0\0no\5t\0\0op\5u\0\0pq\5r\0"+
		"\0qr\5n\0\0r\16\1\0\0\0st\5=\0\0t\20\1\0\0\0uv\5;\0\0v\22\1\0\0\0wx\5"+
		"d\0\0xy\5e\0\0yz\5f\0\0z\24\1\0\0\0{|\5{\0\0|\26\1\0\0\0}~\5}\0\0~\30"+
		"\1\0\0\0\177\u0080\5p\0\0\u0080\u0081\5r\0\0\u0081\u0082\5i\0\0\u0082"+
		"\u0083\5n\0\0\u0083\u0084\5t\0\0\u0084\u0085\5l\0\0\u0085\u0086\5n\0\0"+
		"\u0086\32\1\0\0\0\u0087\u0088\5a\0\0\u0088\u0089\5s\0\0\u0089\u008a\5"+
		"s\0\0\u008a\u008b\5e\0\0\u008b\u008c\5r\0\0\u008c\u008d\5t\0\0\u008d\34"+
		"\1\0\0\0\u008e\u008f\5t\0\0\u008f\u0090\5r\0\0\u0090\u0091\5u\0\0\u0091"+
		"\u0098\5e\0\0\u0092\u0093\5f\0\0\u0093\u0094\5a\0\0\u0094\u0095\5l\0\0"+
		"\u0095\u0096\5s\0\0\u0096\u0098\5e\0\0\u0097\u008e\1\0\0\0\u0097\u0092"+
		"\1\0\0\0\u0098\36\1\0\0\0\u0099\u009a\5n\0\0\u009a\u009b\5i\0\0\u009b"+
		"\u009c\5l\0\0\u009c \1\0\0\0\u009d\u009e\5*\0\0\u009e\"\1\0\0\0\u009f"+
		"\u00a0\5/\0\0\u00a0$\1\0\0\0\u00a1\u00a2\5+\0\0\u00a2&\1\0\0\0\u00a3\u00a4"+
		"\5-\0\0\u00a4(\1\0\0\0\u00a5\u00a9\7\0\0\0\u00a6\u00a8\7\1\0\0\u00a7\u00a6"+
		"\1\0\0\0\u00a8\u00ab\1\0\0\0\u00a9\u00a7\1\0\0\0\u00a9\u00aa\1\0\0\0\u00aa"+
		"*\1\0\0\0\u00ab\u00a9\1\0\0\0\u00ac\u00ae\7\2\0\0\u00ad\u00ac\1\0\0\0"+
		"\u00ae\u00af\1\0\0\0\u00af\u00ad\1\0\0\0\u00af\u00b0\1\0\0\0\u00b0,\1"+
		"\0\0\0\u00b1\u00b2\5=\0\0\u00b2\u00b3\5=\0\0\u00b3.\1\0\0\0\u00b4\u00b5"+
		"\5!\0\0\u00b5\u00b6\5=\0\0\u00b6\60\1\0\0\0\u00b7\u00b8\5<\0\0\u00b8\62"+
		"\1\0\0\0\u00b9\u00ba\5<\0\0\u00ba\u00bb\5=\0\0\u00bb\64\1\0\0\0\u00bc"+
		"\u00bd\5>\0\0\u00bd\66\1\0\0\0\u00be\u00bf\5>\0\0\u00bf\u00c0\5=\0\0\u00c0"+
		"8\1\0\0\0\u00c1\u00c2\5&\0\0\u00c2\u00c3\5&\0\0\u00c3:\1\0\0\0\u00c4\u00c5"+
		"\5|\0\0\u00c5\u00c6\5|\0\0\u00c6<\1\0\0\0\u00c7\u00c8\5!\0\0\u00c8>\1"+
		"\0\0\0\u00c9\u00cb\2\609\0\u00ca\u00c9\1\0\0\0\u00cb\u00cc\1\0\0\0\u00cc"+
		"\u00ca\1\0\0\0\u00cc\u00cd\1\0\0\0\u00cd\u00ce\1\0\0\0\u00ce\u00d2\5."+
		"\0\0\u00cf\u00d1\2\609\0\u00d0\u00cf\1\0\0\0\u00d1\u00d4\1\0\0\0\u00d2"+
		"\u00d0\1\0\0\0\u00d2\u00d3\1\0\0\0\u00d3\u00d6\1\0\0\0\u00d4\u00d2\1\0"+
		"\0\0\u00d5\u00d7\3K%\0\u00d6\u00d5\1\0\0\0\u00d6\u00d7\1\0\0\0\u00d7\u00ee"+
		"\1\0\0\0\u00d8\u00da\2\609\0\u00d9\u00d8\1\0\0\0\u00da\u00dd\1\0\0\0\u00db"+
		"\u00d9\1\0\0\0\u00db\u00dc\1\0\0\0\u00dc\u00de\1\0\0\0\u00dd\u00db\1\0"+
		"\0\0\u00de\u00e0\5.\0\0\u00df\u00e1\2\609\0\u00e0\u00df\1\0\0\0\u00e1"+
		"\u00e2\1\0\0\0\u00e2\u00e0\1\0\0\0\u00e2\u00e3\1\0\0\0\u00e3\u00e5\1\0"+
		"\0\0\u00e4\u00e6\3K%\0\u00e5\u00e4\1\0\0\0\u00e5\u00e6\1\0\0\0\u00e6\u00ee"+
		"\1\0\0\0\u00e7\u00e9\2\609\0\u00e8\u00e7\1\0\0\0\u00e9\u00ea\1\0\0\0\u00ea"+
		"\u00e8\1\0\0\0\u00ea\u00eb\1\0\0\0\u00eb\u00ec\1\0\0\0\u00ec\u00ee\3K"+
		"%\0\u00ed\u00ca\1\0\0\0\u00ed\u00db\1\0\0\0\u00ed\u00e8\1\0\0\0\u00ee"+
		"@\1\0\0\0\u00ef\u00f3\5#\0\0\u00f0\u00f2\b\3\0\0\u00f1\u00f0\1\0\0\0\u00f2"+
		"\u00f5\1\0\0\0\u00f3\u00f1\1\0\0\0\u00f3\u00f4\1\0\0\0\u00f4\u00f6\1\0"+
		"\0\0\u00f5\u00f3\1\0\0\0\u00f6\u00f7\6 \0\0\u00f7B\1\0\0\0\u00f8\u00f9"+
		"\5/\0\0\u00f9\u00fa\5*\0\0\u00fa\u00fe\1\0\0\0\u00fb\u00fd\b\4\0\0\u00fc"+
		"\u00fb\1\0\0\0\u00fd\u0100\1\0\0\0\u00fe\u00fc\1\0\0\0\u00fe\u00ff\1\0"+
		"\0\0\u00ff\u0101\1\0\0\0\u0100\u00fe\1\0\0\0\u0101\u0102\5*\0\0\u0102"+
		"\u0103\5/\0\0\u0103\u0104\1\0\0\0\u0104\u0105\6!\1\0\u0105D\1\0\0\0\u0106"+
		"\u010b\5\'\0\0\u0107\u010a\3O\'\0\u0108\u010a\b\5\0\0\u0109\u0107\1\0"+
		"\0\0\u0109\u0108\1\0\0\0\u010a\u010d\1\0\0\0\u010b\u0109\1\0\0\0\u010b"+
		"\u010c\1\0\0\0\u010c\u010e\1\0\0\0\u010d\u010b\1\0\0\0\u010e\u010f\5\'"+
		"\0\0\u010fF\1\0\0\0\u0110\u0115\5\"\0\0\u0111\u0114\3O\'\0\u0112\u0114"+
		"\b\6\0\0\u0113\u0111\1\0\0\0\u0113\u0112\1\0\0\0\u0114\u0117\1\0\0\0\u0115"+
		"\u0113\1\0\0\0\u0115\u0116\1\0\0\0\u0116\u0118\1\0\0\0\u0117\u0115\1\0"+
		"\0\0\u0118\u0119\5\"\0\0\u0119H\1\0\0\0\u011a\u011c\7\7\0\0\u011b\u011a"+
		"\1\0\0\0\u011c\u011d\1\0\0\0\u011d\u011b\1\0\0\0\u011d\u011e\1\0\0\0\u011e"+
		"\u011f\1\0\0\0\u011f\u0120\6$\2\0\u0120J\1\0\0\0\u0121\u0123\7\b\0\0\u0122"+
		"\u0124\7\t\0\0\u0123\u0122\1\0\0\0\u0123\u0124\1\0\0\0\u0124\u0126\1\0"+
		"\0\0\u0125\u0127\2\609\0\u0126\u0125\1\0\0\0\u0127\u0128\1\0\0\0\u0128"+
		"\u0126\1\0\0\0\u0128\u0129\1\0\0\0\u0129L\1\0\0\0\u012a\u012b\7\n\0\0"+
		"\u012bN\1\0\0\0\u012c\u012d\5\\\0\0\u012d\u0131\7\13\0\0\u012e\u0131\3"+
		"S)\0\u012f\u0131\3Q(\0\u0130\u012c\1\0\0\0\u0130\u012e\1\0\0\0\u0130\u012f"+
		"\1\0\0\0\u0131P\1\0\0\0\u0132\u0133\5\\\0\0\u0133\u0134\2\60\63\0\u0134"+
		"\u0135\2\60\67\0\u0135\u013c\2\60\67\0\u0136\u0137\5\\\0\0\u0137\u0138"+
		"\2\60\67\0\u0138\u013c\2\60\67\0\u0139\u013a\5\\\0\0\u013a\u013c\2\60"+
		"\67\0\u013b\u0132\1\0\0\0\u013b\u0136\1\0\0\0\u013b\u0139\1\0\0\0\u013c"+
		"R\1\0\0\0\u013d\u013e\5\\\0\0\u013e\u013f\5u\0\0\u013f\u0140\3M&\0\u0140"+
		"\u0141\3M&\0\u0141\u0142\3M&\0\u0142\u0143\3M&\0\u0143T\1\0\0\0\27\0\u0097"+
		"\u00a9\u00af\u00cc\u00d2\u00d6\u00db\u00e2\u00e5\u00ea\u00ed\u00f3\u00fe"+
		"\u0109\u010b\u0113\u0115\u011d\u0123\u0128\u0130\u013b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}