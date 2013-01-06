// $ANTLR ANTLRVersion> Mini4Parser.java generatedTimestamp>

package com.fo.mini4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mini4Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		BOOL=17, NIL=18, MUL=19, DIV=20, ADD=21, SUB=22, ID=23, INT=24, EQ=25, 
		NE=26, LT=27, LE=28, GT=29, GE=30, AND=31, OR=32, NOT=33, FLOAT=34, SL_COMMENT=35, 
		ML_COMMENT=36, Q_STRING=37, QQ_STRING=38, WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'function'", "'.'", "','", "'print'", "'('", "'if'", 
		"'return'", "'='", "';'", "'def'", "'{'", "'else'", "'}'", "'println'", 
		"'assert'", "BOOL", "'nil'", "'*'", "'/'", "'+'", "'-'", "ID", "INT", 
		"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'!'", "FLOAT", 
		"SL_COMMENT", "ML_COMMENT", "Q_STRING", "QQ_STRING", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_block = 3, RULE_brick = 4, 
		RULE_qid = 5, RULE_postfix = 6, RULE_functionCall = 7, RULE_mapExpr = 8, 
		RULE_mapElDecl = 9, RULE_parDefList = 10, RULE_ifStatement = 11;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "block", "brick", "qid", "postfix", "functionCall", 
		"mapExpr", "mapElDecl", "parDefList", "ifStatement"
	};

	@Override
	public String getGrammarFileName() { return "Mini4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }



	public Mini4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext<Token> {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<? extends StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitProg(this);
			else return null;
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, 0);
		enterRule(_localctx, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24); stat();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==5 || _la==6 || _la==7 || _la==8 || _la==11 || _la==12 || _la==15 || _la==16 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING );
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

	public static class StatContext extends ParserRuleContext<Token> {
		public StatContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StatContext {
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitAssign(this);
			else return null;
		}
	}
	public static class DefContext extends StatContext {
		public TerminalNode<Token> ID() { return getToken(Mini4Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitDef(this);
			else return null;
		}
	}
	public static class ExprLabelContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitExprLabel(this);
			else return null;
		}
	}
	public static class PrintlnContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitPrintln(this);
			else return null;
		}
	}
	public static class AssertContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssertContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitAssert(this);
			else return null;
		}
	}
	public static class ReturnLabelContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitReturnLabel(this);
			else return null;
		}
	}
	public static class PrintContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitPrint(this);
			else return null;
		}
	}
	public static class BlockLabelContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitBlockLabel(this);
			else return null;
		}
	}
	public static class IfStatementLabelContext extends StatContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitIfStatementLabel(this);
			else return null;
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, 2);
		enterRule(_localctx, RULE_stat);
		int _la;
		try {
			setState(63);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					_localctx = new DefContext(_localctx);
					enterOuterAlt(_localctx, 1);
					{
					setState(29); match(11);
					setState(30); match(ID);
					setState(33);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==9 ) {
						{
						setState(31); match(9);
						setState(32); expr(0);
						}
					}

					setState(35); match(10);
					}
					break;
				case 2:
					_localctx = new AssignContext(_localctx);
					enterOuterAlt(_localctx, 2);
					{
					setState(36); qid();
					setState(37); match(9);
					setState(38); expr(0);
					setState(39); match(10);
					}
					break;
				case 3:
					_localctx = new AssertContext(_localctx);
					enterOuterAlt(_localctx, 3);
					{
					setState(41); match(16);
					setState(42); expr(0);
					setState(43); match(10);
					}
					break;
				case 4:
					_localctx = new PrintContext(_localctx);
					enterOuterAlt(_localctx, 4);
					{
					setState(45); match(5);
					setState(46); expr(0);
					setState(47); match(10);
					}
					break;
				case 5:
					_localctx = new PrintlnContext(_localctx);
					enterOuterAlt(_localctx, 5);
					{
					setState(49); match(15);
					setState(50); expr(0);
					setState(51); match(10);
					}
					break;
				case 6:
					_localctx = new ReturnLabelContext(_localctx);
					enterOuterAlt(_localctx, 6);
					{
					setState(53); match(8);
					setState(55);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==2 || _la==6 || _la==12 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
						{
						setState(54); expr(0);
						}
					}

					setState(57); match(10);
					}
					break;
				case 7:
					_localctx = new IfStatementLabelContext(_localctx);
					enterOuterAlt(_localctx, 7);
					{
					setState(58); ifStatement();
					}
					break;
				case 8:
					_localctx = new BlockLabelContext(_localctx);
					enterOuterAlt(_localctx, 8);
					{
					setState(59); block();
					}
					break;
				case 9:
					_localctx = new ExprLabelContext(_localctx);
					enterOuterAlt(_localctx, 9);
					{
					setState(60); expr(0);
					setState(61); match(10);
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

	public static class ExprContext extends ParserRuleContext<Token> {
		public int _p;
		public ExprContext(ParserRuleContext<Token> parent, int state) { super(parent, state); }
		public ExprContext(ParserRuleContext<Token> parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndExprContext extends ExprContext {
		public Token op;
		public TerminalNode<Token> AND() { return getToken(Mini4Parser.AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitAndExpr(this);
			else return null;
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitAddSubExpr(this);
			else return null;
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitMulDivExpr(this);
			else return null;
		}
	}
	public static class RelExprContext extends ExprContext {
		public Token op;
		public TerminalNode<Token> GE() { return getToken(Mini4Parser.GE, 0); }
		public TerminalNode<Token> GT() { return getToken(Mini4Parser.GT, 0); }
		public TerminalNode<Token> LT() { return getToken(Mini4Parser.LT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode<Token> LE() { return getToken(Mini4Parser.LE, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitRelExpr(this);
			else return null;
		}
	}
	public static class BrickLabelContext extends ExprContext {
		public BrickContext brick() {
			return getRuleContext(BrickContext.class,0);
		}
		public BrickLabelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitBrickLabel(this);
			else return null;
		}
	}
	public static class EqExprContext extends ExprContext {
		public Token op;
		public TerminalNode<Token> EQ() { return getToken(Mini4Parser.EQ, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode<Token> NE() { return getToken(Mini4Parser.NE, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitEqExpr(this);
			else return null;
		}
	}
	public static class OrExprContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode<Token> OR() { return getToken(Mini4Parser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitOrExpr(this);
			else return null;
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext<Token> _parentctx = _ctx;
		ExprContext _localctx = new ExprContext(_ctx, 4, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		pushNewRecursionContext(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BrickLabelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(66); brick();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					_prevctx.stop = _input.LT(-1);
					{
					setState(86);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							_localctx = new MulDivExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(68);
							if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
							setState(69);
							((MulDivExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==MUL || _la==DIV) ) {
								((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(70); expr(8);
							}
							break;
						case 2:
							{
							_localctx = new AddSubExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(71);
							if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
							setState(72);
							((AddSubExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==ADD || _la==SUB) ) {
								((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(73); expr(7);
							}
							break;
						case 3:
							{
							_localctx = new RelExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(74);
							if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
							setState(75);
							((RelExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==LT || _la==LE || _la==GT || _la==GE) ) {
								((RelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(76); expr(6);
							}
							break;
						case 4:
							{
							_localctx = new EqExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(77);
							if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
							setState(78);
							((EqExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==EQ || _la==NE) ) {
								((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(79); expr(5);
							}
							break;
						case 5:
							{
							_localctx = new AndExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(80);
							if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
							setState(81); ((AndExprContext)_localctx).op = match(AND);
							setState(82); expr(4);
							}
							break;
						case 6:
							{
							_localctx = new OrExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(83);
							if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
							setState(84); ((OrExprContext)_localctx).op = match(OR);
							setState(85); expr(3);
							}
							break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext<Token> {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<? extends StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitBlock(this);
			else return null;
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, 6);
		enterRule(_localctx, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(12);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==2 || _la==5 || _la==6 || _la==7 || _la==8 || _la==11 || _la==12 || _la==15 || _la==16 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
				{
				{
				setState(92); stat();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(14);
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

	public static class BrickContext extends ParserRuleContext<Token> {
		public BrickContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_brick; }
	 
		public BrickContext() { }
		public void copyFrom(BrickContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QStringContext extends BrickContext {
		public TerminalNode<Token> Q_STRING() { return getToken(Mini4Parser.Q_STRING, 0); }
		public QStringContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitQString(this);
			else return null;
		}
	}
	public static class QidLabelContext extends BrickContext {
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public QidLabelContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitQidLabel(this);
			else return null;
		}
	}
	public static class MapExprLabelContext extends BrickContext {
		public MapExprContext mapExpr() {
			return getRuleContext(MapExprContext.class,0);
		}
		public MapExprLabelContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitMapExprLabel(this);
			else return null;
		}
	}
	public static class FunctionDefContext extends BrickContext {
		public ParDefListContext parDefList() {
			return getRuleContext(ParDefListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitFunctionDef(this);
			else return null;
		}
	}
	public static class IntContext extends BrickContext {
		public TerminalNode<Token> INT() { return getToken(Mini4Parser.INT, 0); }
		public IntContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitInt(this);
			else return null;
		}
	}
	public static class FunctionCallLabelContext extends BrickContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallLabelContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitFunctionCallLabel(this);
			else return null;
		}
	}
	public static class ParensContext extends BrickContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitParens(this);
			else return null;
		}
	}
	public static class BoolContext extends BrickContext {
		public TerminalNode<Token> BOOL() { return getToken(Mini4Parser.BOOL, 0); }
		public BoolContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitBool(this);
			else return null;
		}
	}
	public static class FloatContext extends BrickContext {
		public TerminalNode<Token> FLOAT() { return getToken(Mini4Parser.FLOAT, 0); }
		public FloatContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitFloat(this);
			else return null;
		}
	}
	public static class QqStringContext extends BrickContext {
		public TerminalNode<Token> QQ_STRING() { return getToken(Mini4Parser.QQ_STRING, 0); }
		public QqStringContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitQqString(this);
			else return null;
		}
	}
	public static class NilContext extends BrickContext {
		public TerminalNode<Token> NIL() { return getToken(Mini4Parser.NIL, 0); }
		public NilContext(BrickContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitNil(this);
			else return null;
		}
	}

	public final BrickContext brick() throws RecognitionException {
		BrickContext _localctx = new BrickContext(_ctx, 8);
		enterRule(_localctx, RULE_brick);
		int _la;
		try {
			setState(124);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					_localctx = new IntContext(_localctx);
					enterOuterAlt(_localctx, 1);
					{
					setState(100); match(INT);
					}
					break;
				case 2:
					_localctx = new FloatContext(_localctx);
					enterOuterAlt(_localctx, 2);
					{
					setState(101); match(FLOAT);
					}
					break;
				case 3:
					_localctx = new BoolContext(_localctx);
					enterOuterAlt(_localctx, 3);
					{
					setState(102); match(BOOL);
					}
					break;
				case 4:
					_localctx = new NilContext(_localctx);
					enterOuterAlt(_localctx, 4);
					{
					setState(103); match(NIL);
					}
					break;
				case 5:
					_localctx = new QStringContext(_localctx);
					enterOuterAlt(_localctx, 5);
					{
					setState(104); match(Q_STRING);
					}
					break;
				case 6:
					_localctx = new QqStringContext(_localctx);
					enterOuterAlt(_localctx, 6);
					{
					setState(105); match(QQ_STRING);
					}
					break;
				case 7:
					_localctx = new QidLabelContext(_localctx);
					enterOuterAlt(_localctx, 7);
					{
					setState(106); qid();
					}
					break;
				case 8:
					_localctx = new ParensContext(_localctx);
					enterOuterAlt(_localctx, 8);
					{
					setState(107); match(6);
					setState(108); expr(0);
					setState(109); match(1);
					}
					break;
				case 9:
					_localctx = new MapExprLabelContext(_localctx);
					enterOuterAlt(_localctx, 9);
					{
					setState(111); match(12);
					setState(113);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==ID ) {
						{
						setState(112); mapExpr();
						}
					}

					setState(115); match(14);
					}
					break;
				case 10:
					_localctx = new FunctionDefContext(_localctx);
					enterOuterAlt(_localctx, 10);
					{
					setState(116); match(2);
					setState(117); match(6);
					setState(119);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==ID ) {
						{
						setState(118); parDefList();
						}
					}

					setState(121); match(1);
					setState(122); block();
					}
					break;
				case 11:
					_localctx = new FunctionCallLabelContext(_localctx);
					enterOuterAlt(_localctx, 11);
					{
					setState(123); functionCall();
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

	public static class QidContext extends ParserRuleContext<Token> {
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public List<? extends PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public TerminalNode<Token> ID() { return getToken(Mini4Parser.ID, 0); }
		public QidContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_qid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitQid(this);
			else return null;
		}
	}

	public final QidContext qid() throws RecognitionException {
		QidContext _localctx = new QidContext(_ctx, 10);
		enterRule(_localctx, RULE_qid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(ID);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(127); postfix();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
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

	public static class PostfixContext extends ParserRuleContext<Token> {
		public PostfixContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberDeclContext extends PostfixContext {
		public TerminalNode<Token> ID() { return getToken(Mini4Parser.ID, 0); }
		public MemberDeclContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitMemberDecl(this);
			else return null;
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, 12);
		enterRule(_localctx, RULE_postfix);
		try {
			_localctx = new MemberDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(3);
			setState(134); match(ID);
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

	public static class FunctionCallContext extends ParserRuleContext<Token> {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public List<? extends ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public FunctionCallContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitFunctionCall(this);
			else return null;
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, 14);
		enterRule(_localctx, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); qid();
			setState(137); match(6);
			setState(146);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==2 || _la==6 || _la==12 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
				{
				setState(138); expr(0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ( _la==4 ) {
					{
					{
					setState(139); match(4);
					setState(140); expr(0);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(148); match(1);
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

	public static class MapExprContext extends ParserRuleContext<Token> {
		public MapElDeclContext mapElDecl(int i) {
			return getRuleContext(MapElDeclContext.class,i);
		}
		public List<? extends MapElDeclContext> mapElDecl() {
			return getRuleContexts(MapElDeclContext.class);
		}
		public MapExprContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_mapExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitMapExpr(this);
			else return null;
		}
	}

	public final MapExprContext mapExpr() throws RecognitionException {
		MapExprContext _localctx = new MapExprContext(_ctx, 16);
		enterRule(_localctx, RULE_mapExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); mapElDecl();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==4 ) {
				{
				{
				setState(151); match(4);
				setState(152); mapElDecl();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MapElDeclContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> ID() { return getToken(Mini4Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MapElDeclContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_mapElDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitMapElDecl(this);
			else return null;
		}
	}

	public final MapElDeclContext mapElDecl() throws RecognitionException {
		MapElDeclContext _localctx = new MapElDeclContext(_ctx, 18);
		enterRule(_localctx, RULE_mapElDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(ID);
			setState(159); match(9);
			setState(160); expr(0);
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

	public static class ParDefListContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> ID(int i) {
			return getToken(Mini4Parser.ID, i);
		}
		public List<TerminalNode<Token>> ID() { return getTokens(Mini4Parser.ID); }
		public ParDefListContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_parDefList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitParDefList(this);
			else return null;
		}
	}

	public final ParDefListContext parDefList() throws RecognitionException {
		ParDefListContext _localctx = new ParDefListContext(_ctx, 20);
		enterRule(_localctx, RULE_parDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==4 ) {
				{
				{
				setState(163); match(4);
				setState(164); match(ID);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IfStatementContext extends ParserRuleContext<Token> {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<? extends BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatementContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mini4Visitor ) return ((Mini4Visitor<T>)visitor).visitIfStatement(this);
			else return null;
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, 22);
		enterRule(_localctx, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(7);
			setState(171); match(6);
			setState(172); expr(0);
			setState(173); match(1);
			setState(174); block();
			setState(177);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==13 ) {
				{
				setState(175); match(13);
				setState(176); block();
				}
			}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch ( ruleIndex ) {
				case 2 : return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	public boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch ( predIndex ) {
			case 0 : return 7 >= _localctx._p;
			case 1 : return 6 >= _localctx._p;
			case 2 : return 5 >= _localctx._p;
			case 3 : return 4 >= _localctx._p;
			case 4 : return 3 >= _localctx._p;
			case 5 : return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\'\u00b4\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7"+
		"\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\1\0\4\0\32\b\0\13\0\f\0\33\1\1"+
		"\1\1\1\1\1\1\3\1\"\b\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1"+
		"\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\3\18\b\1\1\1\1\1\1\1\1\1\1\1\1\1\3\1"+
		"@\b\1\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
		"\1\2\1\2\1\2\1\2\1\2\5\2W\b\2\n\2\f\2Z\t\2\1\3\1\3\5\3^\b\3\n\3\f\3a\t"+
		"\3\1\3\1\3\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\3\4r\b"+
		"\4\1\4\1\4\1\4\1\4\3\4x\b\4\1\4\1\4\1\4\3\4}\b\4\1\5\1\5\5\5\u0081\b\5"+
		"\n\5\f\5\u0084\t\5\1\6\1\6\1\6\1\7\1\7\1\7\1\7\1\7\5\7\u008e\b\7\n\7\f"+
		"\7\u0091\t\7\3\7\u0093\b\7\1\7\1\7\1\b\1\b\1\b\5\b\u009a\b\b\n\b\f\b\u009d"+
		"\t\b\1\t\1\t\1\t\1\t\1\n\1\n\1\n\5\n\u00a6\b\n\n\n\f\n\u00a9\t\n\1\13"+
		"\1\13\1\13\1\13\1\13\1\13\1\13\3\13\u00b2\b\13\1\13\f\0\2\4\6\b\n\f\16"+
		"\20\22\24\26\0\4\1\23\24\1\25\26\1\33\36\1\31\32\u00cb\0\31\1\0\0\0\2"+
		"?\1\0\0\0\4A\1\0\0\0\6[\1\0\0\0\b|\1\0\0\0\n~\1\0\0\0\f\u0085\1\0\0\0"+
		"\16\u0088\1\0\0\0\20\u0096\1\0\0\0\22\u009e\1\0\0\0\24\u00a2\1\0\0\0\26"+
		"\u00aa\1\0\0\0\30\32\3\2\1\0\31\30\1\0\0\0\32\33\1\0\0\0\33\31\1\0\0\0"+
		"\33\34\1\0\0\0\34\1\1\0\0\0\35\36\5\13\0\0\36!\5\27\0\0\37 \5\t\0\0 \""+
		"\3\4\2\0!\37\1\0\0\0!\"\1\0\0\0\"#\1\0\0\0#@\5\n\0\0$%\3\n\5\0%&\5\t\0"+
		"\0&\'\3\4\2\0\'(\5\n\0\0(@\1\0\0\0)*\5\20\0\0*+\3\4\2\0+,\5\n\0\0,@\1"+
		"\0\0\0-.\5\5\0\0./\3\4\2\0/\60\5\n\0\0\60@\1\0\0\0\61\62\5\17\0\0\62\63"+
		"\3\4\2\0\63\64\5\n\0\0\64@\1\0\0\0\65\67\5\b\0\0\668\3\4\2\0\67\66\1\0"+
		"\0\0\678\1\0\0\089\1\0\0\09@\5\n\0\0:@\3\26\13\0;@\3\6\3\0<=\3\4\2\0="+
		">\5\n\0\0>@\1\0\0\0?\35\1\0\0\0?$\1\0\0\0?)\1\0\0\0?-\1\0\0\0?\61\1\0"+
		"\0\0?\65\1\0\0\0?:\1\0\0\0?;\1\0\0\0?<\1\0\0\0@\3\1\0\0\0AB\6\2\uffff"+
		"\0BC\3\b\4\0CX\1\0\0\0DE\4\2\0\1EF\7\0\0\0FW\3\4\2\0GH\4\2\1\1HI\7\1\0"+
		"\0IW\3\4\2\0JK\4\2\2\1KL\7\2\0\0LW\3\4\2\0MN\4\2\3\1NO\7\3\0\0OW\3\4\2"+
		"\0PQ\4\2\4\1QR\5\37\0\0RW\3\4\2\0ST\4\2\5\1TU\5 \0\0UW\3\4\2\0VD\1\0\0"+
		"\0VG\1\0\0\0VJ\1\0\0\0VM\1\0\0\0VP\1\0\0\0VS\1\0\0\0WZ\1\0\0\0XV\1\0\0"+
		"\0XY\1\0\0\0Y\5\1\0\0\0ZX\1\0\0\0[_\5\f\0\0\\^\3\2\1\0]\\\1\0\0\0^a\1"+
		"\0\0\0_]\1\0\0\0_`\1\0\0\0`b\1\0\0\0a_\1\0\0\0bc\5\16\0\0c\7\1\0\0\0d"+
		"}\5\30\0\0e}\5\"\0\0f}\5\21\0\0g}\5\22\0\0h}\5%\0\0i}\5&\0\0j}\3\n\5\0"+
		"kl\5\6\0\0lm\3\4\2\0mn\5\1\0\0n}\1\0\0\0oq\5\f\0\0pr\3\20\b\0qp\1\0\0"+
		"\0qr\1\0\0\0rs\1\0\0\0s}\5\16\0\0tu\5\2\0\0uw\5\6\0\0vx\3\24\n\0wv\1\0"+
		"\0\0wx\1\0\0\0xy\1\0\0\0yz\5\1\0\0z}\3\6\3\0{}\3\16\7\0|d\1\0\0\0|e\1"+
		"\0\0\0|f\1\0\0\0|g\1\0\0\0|h\1\0\0\0|i\1\0\0\0|j\1\0\0\0|k\1\0\0\0|o\1"+
		"\0\0\0|t\1\0\0\0|{\1\0\0\0}\t\1\0\0\0~\u0082\5\27\0\0\177\u0081\3\f\6"+
		"\0\u0080\177\1\0\0\0\u0081\u0084\1\0\0\0\u0082\u0080\1\0\0\0\u0082\u0083"+
		"\1\0\0\0\u0083\13\1\0\0\0\u0084\u0082\1\0\0\0\u0085\u0086\5\3\0\0\u0086"+
		"\u0087\5\27\0\0\u0087\r\1\0\0\0\u0088\u0089\3\n\5\0\u0089\u0092\5\6\0"+
		"\0\u008a\u008f\3\4\2\0\u008b\u008c\5\4\0\0\u008c\u008e\3\4\2\0\u008d\u008b"+
		"\1\0\0\0\u008e\u0091\1\0\0\0\u008f\u008d\1\0\0\0\u008f\u0090\1\0\0\0\u0090"+
		"\u0093\1\0\0\0\u0091\u008f\1\0\0\0\u0092\u008a\1\0\0\0\u0092\u0093\1\0"+
		"\0\0\u0093\u0094\1\0\0\0\u0094\u0095\5\1\0\0\u0095\17\1\0\0\0\u0096\u009b"+
		"\3\22\t\0\u0097\u0098\5\4\0\0\u0098\u009a\3\22\t\0\u0099\u0097\1\0\0\0"+
		"\u009a\u009d\1\0\0\0\u009b\u0099\1\0\0\0\u009b\u009c\1\0\0\0\u009c\21"+
		"\1\0\0\0\u009d\u009b\1\0\0\0\u009e\u009f\5\27\0\0\u009f\u00a0\5\t\0\0"+
		"\u00a0\u00a1\3\4\2\0\u00a1\23\1\0\0\0\u00a2\u00a7\5\27\0\0\u00a3\u00a4"+
		"\5\4\0\0\u00a4\u00a6\5\27\0\0\u00a5\u00a3\1\0\0\0\u00a6\u00a9\1\0\0\0"+
		"\u00a7\u00a5\1\0\0\0\u00a7\u00a8\1\0\0\0\u00a8\25\1\0\0\0\u00a9\u00a7"+
		"\1\0\0\0\u00aa\u00ab\5\7\0\0\u00ab\u00ac\5\6\0\0\u00ac\u00ad\3\4\2\0\u00ad"+
		"\u00ae\5\1\0\0\u00ae\u00b1\3\6\3\0\u00af\u00b0\5\r\0\0\u00b0\u00b2\3\6"+
		"\3\0\u00b1\u00af\1\0\0\0\u00b1\u00b2\1\0\0\0\u00b2\27\1\0\0\0\20\33!\67"+
		"?VX_qw|\u0082\u008f\u0092\u009b\u00a7\u00b1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}