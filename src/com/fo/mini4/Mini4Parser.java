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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BOOL=15, NIL=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, ID=21, INT=22, EQ=23, NE=24, LT=25, LE=26, GT=27, 
		GE=28, AND=29, OR=30, NOT=31, FLOAT=32, SL_COMMENT=33, ML_COMMENT=34, 
		Q_STRING=35, QQ_STRING=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'function'", "'.'", "','", "'print'", "'('", "'return'", 
		"'='", "';'", "'def'", "'{'", "'}'", "'println'", "'assert'", "BOOL", 
		"'nil'", "'*'", "'/'", "'+'", "'-'", "ID", "INT", "'=='", "'!='", "'<'", 
		"'<='", "'>'", "'>='", "'&&'", "'||'", "'!'", "FLOAT", "SL_COMMENT", "ML_COMMENT", 
		"Q_STRING", "QQ_STRING", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_block = 3, RULE_brick = 4, 
		RULE_qid = 5, RULE_postfix = 6, RULE_functionCall = 7, RULE_mapExpr = 8, 
		RULE_mapElDecl = 9, RULE_parDefList = 10;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "block", "brick", "qid", "postfix", "functionCall", 
		"mapExpr", "mapElDecl", "parDefList"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22); stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==5 || _la==6 || _la==7 || _la==10 || _la==11 || _la==13 || _la==14 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING );
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, 2);
		enterRule(_localctx, RULE_stat);
		int _la;
		try {
			setState(60);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					_localctx = new DefContext(_localctx);
					enterOuterAlt(_localctx, 1);
					{
					setState(27); match(10);
					setState(28); match(ID);
					setState(31);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==8 ) {
						{
						setState(29); match(8);
						setState(30); expr(0);
						}
					}

					setState(33); match(9);
					}
					break;
				case 2:
					_localctx = new AssignContext(_localctx);
					enterOuterAlt(_localctx, 2);
					{
					setState(34); qid();
					setState(35); match(8);
					setState(36); expr(0);
					setState(37); match(9);
					}
					break;
				case 3:
					_localctx = new AssertContext(_localctx);
					enterOuterAlt(_localctx, 3);
					{
					setState(39); match(14);
					setState(40); expr(0);
					setState(41); match(9);
					}
					break;
				case 4:
					_localctx = new PrintContext(_localctx);
					enterOuterAlt(_localctx, 4);
					{
					setState(43); match(5);
					setState(44); expr(0);
					setState(45); match(9);
					}
					break;
				case 5:
					_localctx = new PrintlnContext(_localctx);
					enterOuterAlt(_localctx, 5);
					{
					setState(47); match(13);
					setState(48); expr(0);
					setState(49); match(9);
					}
					break;
				case 6:
					_localctx = new ReturnLabelContext(_localctx);
					enterOuterAlt(_localctx, 6);
					{
					setState(51); match(7);
					setState(53);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==2 || _la==6 || _la==11 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
						{
						setState(52); expr(0);
						}
					}

					setState(55); match(9);
					}
					break;
				case 7:
					_localctx = new BlockLabelContext(_localctx);
					enterOuterAlt(_localctx, 7);
					{
					setState(56); block();
					}
					break;
				case 8:
					_localctx = new ExprLabelContext(_localctx);
					enterOuterAlt(_localctx, 8);
					{
					setState(57); expr(0);
					setState(58); match(9);
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

			setState(63); brick();
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					_prevctx.stop = _input.LT(-1);
					{
					setState(83);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							_localctx = new MulDivExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(65);
							if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
							setState(66);
							((MulDivExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==MUL || _la==DIV) ) {
								((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(67); expr(8);
							}
							break;
						case 2:
							{
							_localctx = new AddSubExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(68);
							if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
							setState(69);
							((AddSubExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==ADD || _la==SUB) ) {
								((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(70); expr(7);
							}
							break;
						case 3:
							{
							_localctx = new RelExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(71);
							if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
							setState(72);
							((RelExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==LT || _la==LE || _la==GT || _la==GE) ) {
								((RelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(73); expr(6);
							}
							break;
						case 4:
							{
							_localctx = new EqExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(74);
							if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
							setState(75);
							((EqExprContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==EQ || _la==NE) ) {
								((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							consume();
							setState(76); expr(5);
							}
							break;
						case 5:
							{
							_localctx = new AndExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(77);
							if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
							setState(78); ((AndExprContext)_localctx).op = match(AND);
							setState(79); expr(4);
							}
							break;
						case 6:
							{
							_localctx = new OrExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(80);
							if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
							setState(81); ((OrExprContext)_localctx).op = match(OR);
							setState(82); expr(3);
							}
							break;
					}
					} 
				}
				setState(87);
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
			setState(88); match(11);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==2 || _la==5 || _la==6 || _la==7 || _la==10 || _la==11 || _la==13 || _la==14 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
				{
				{
				setState(89); stat();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); match(12);
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
			setState(121);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					_localctx = new IntContext(_localctx);
					enterOuterAlt(_localctx, 1);
					{
					setState(97); match(INT);
					}
					break;
				case 2:
					_localctx = new FloatContext(_localctx);
					enterOuterAlt(_localctx, 2);
					{
					setState(98); match(FLOAT);
					}
					break;
				case 3:
					_localctx = new BoolContext(_localctx);
					enterOuterAlt(_localctx, 3);
					{
					setState(99); match(BOOL);
					}
					break;
				case 4:
					_localctx = new NilContext(_localctx);
					enterOuterAlt(_localctx, 4);
					{
					setState(100); match(NIL);
					}
					break;
				case 5:
					_localctx = new QStringContext(_localctx);
					enterOuterAlt(_localctx, 5);
					{
					setState(101); match(Q_STRING);
					}
					break;
				case 6:
					_localctx = new QqStringContext(_localctx);
					enterOuterAlt(_localctx, 6);
					{
					setState(102); match(QQ_STRING);
					}
					break;
				case 7:
					_localctx = new QidLabelContext(_localctx);
					enterOuterAlt(_localctx, 7);
					{
					setState(103); qid();
					}
					break;
				case 8:
					_localctx = new ParensContext(_localctx);
					enterOuterAlt(_localctx, 8);
					{
					setState(104); match(6);
					setState(105); expr(0);
					setState(106); match(1);
					}
					break;
				case 9:
					_localctx = new MapExprLabelContext(_localctx);
					enterOuterAlt(_localctx, 9);
					{
					setState(108); match(11);
					setState(110);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==ID ) {
						{
						setState(109); mapExpr();
						}
					}

					setState(112); match(12);
					}
					break;
				case 10:
					_localctx = new FunctionDefContext(_localctx);
					enterOuterAlt(_localctx, 10);
					{
					setState(113); match(2);
					setState(114); match(6);
					setState(116);
					//_errHandler.sync(this);
					_la = _input.LA(1);
					if ( _la==ID ) {
						{
						setState(115); parDefList();
						}
					}

					setState(118); match(1);
					setState(119); block();
					}
					break;
				case 11:
					_localctx = new FunctionCallLabelContext(_localctx);
					enterOuterAlt(_localctx, 11);
					{
					setState(120); functionCall();
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
			setState(123); match(ID);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(124); postfix();
					}
					} 
				}
				setState(129);
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
			setState(130); match(3);
			setState(131); match(ID);
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
			setState(133); qid();
			setState(134); match(6);
			setState(143);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==2 || _la==6 || _la==11 || _la==BOOL || _la==NIL || _la==ID || _la==INT || _la==FLOAT || _la==Q_STRING || _la==QQ_STRING ) {
				{
				setState(135); expr(0);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ( _la==4 ) {
					{
					{
					setState(136); match(4);
					setState(137); expr(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145); match(1);
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
			setState(147); mapElDecl();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==4 ) {
				{
				{
				setState(148); match(4);
				setState(149); mapElDecl();
				}
				}
				setState(154);
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
			setState(155); match(ID);
			setState(156); match(8);
			setState(157); expr(0);
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
			setState(159); match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==4 ) {
				{
				{
				setState(160); match(4);
				setState(161); match(ID);
				}
				}
				setState(166);
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
		"\3%\u00a8\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7"+
		"\7\7\2\b\7\b\2\t\7\t\2\n\7\n\1\0\4\0\30\b\0\13\0\f\0\31\1\1\1\1\1\1\1"+
		"\1\3\1 \b\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1"+
		"\1\1\1\1\1\1\1\1\1\1\1\3\1\66\b\1\1\1\1\1\1\1\1\1\1\1\3\1=\b\1\1\2\1\2"+
		"\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1"+
		"\2\1\2\5\2T\b\2\n\2\f\2W\t\2\1\3\1\3\5\3[\b\3\n\3\f\3^\t\3\1\3\1\3\1\4"+
		"\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\3\4o\b\4\1\4\1\4\1\4"+
		"\1\4\3\4u\b\4\1\4\1\4\1\4\3\4z\b\4\1\5\1\5\5\5~\b\5\n\5\f\5\u0081\t\5"+
		"\1\6\1\6\1\6\1\7\1\7\1\7\1\7\1\7\5\7\u008b\b\7\n\7\f\7\u008e\t\7\3\7\u0090"+
		"\b\7\1\7\1\7\1\b\1\b\1\b\5\b\u0097\b\b\n\b\f\b\u009a\t\b\1\t\1\t\1\t\1"+
		"\t\1\n\1\n\1\n\5\n\u00a3\b\n\n\n\f\n\u00a6\t\n\1\n\13\0\2\4\6\b\n\f\16"+
		"\20\22\24\0\4\1\21\22\1\23\24\1\31\34\1\27\30\u00be\0\27\1\0\0\0\2<\1"+
		"\0\0\0\4>\1\0\0\0\6X\1\0\0\0\by\1\0\0\0\n{\1\0\0\0\f\u0082\1\0\0\0\16"+
		"\u0085\1\0\0\0\20\u0093\1\0\0\0\22\u009b\1\0\0\0\24\u009f\1\0\0\0\26\30"+
		"\3\2\1\0\27\26\1\0\0\0\30\31\1\0\0\0\31\27\1\0\0\0\31\32\1\0\0\0\32\1"+
		"\1\0\0\0\33\34\5\n\0\0\34\37\5\25\0\0\35\36\5\b\0\0\36 \3\4\2\0\37\35"+
		"\1\0\0\0\37 \1\0\0\0 !\1\0\0\0!=\5\t\0\0\"#\3\n\5\0#$\5\b\0\0$%\3\4\2"+
		"\0%&\5\t\0\0&=\1\0\0\0\'(\5\16\0\0()\3\4\2\0)*\5\t\0\0*=\1\0\0\0+,\5\5"+
		"\0\0,-\3\4\2\0-.\5\t\0\0.=\1\0\0\0/\60\5\r\0\0\60\61\3\4\2\0\61\62\5\t"+
		"\0\0\62=\1\0\0\0\63\65\5\7\0\0\64\66\3\4\2\0\65\64\1\0\0\0\65\66\1\0\0"+
		"\0\66\67\1\0\0\0\67=\5\t\0\08=\3\6\3\09:\3\4\2\0:;\5\t\0\0;=\1\0\0\0<"+
		"\33\1\0\0\0<\"\1\0\0\0<\'\1\0\0\0<+\1\0\0\0</\1\0\0\0<\63\1\0\0\0<8\1"+
		"\0\0\0<9\1\0\0\0=\3\1\0\0\0>?\6\2\uffff\0?@\3\b\4\0@U\1\0\0\0AB\4\2\0"+
		"\1BC\7\0\0\0CT\3\4\2\0DE\4\2\1\1EF\7\1\0\0FT\3\4\2\0GH\4\2\2\1HI\7\2\0"+
		"\0IT\3\4\2\0JK\4\2\3\1KL\7\3\0\0LT\3\4\2\0MN\4\2\4\1NO\5\35\0\0OT\3\4"+
		"\2\0PQ\4\2\5\1QR\5\36\0\0RT\3\4\2\0SA\1\0\0\0SD\1\0\0\0SG\1\0\0\0SJ\1"+
		"\0\0\0SM\1\0\0\0SP\1\0\0\0TW\1\0\0\0US\1\0\0\0UV\1\0\0\0V\5\1\0\0\0WU"+
		"\1\0\0\0X\\\5\13\0\0Y[\3\2\1\0ZY\1\0\0\0[^\1\0\0\0\\Z\1\0\0\0\\]\1\0\0"+
		"\0]_\1\0\0\0^\\\1\0\0\0_`\5\f\0\0`\7\1\0\0\0az\5\26\0\0bz\5 \0\0cz\5\17"+
		"\0\0dz\5\20\0\0ez\5#\0\0fz\5$\0\0gz\3\n\5\0hi\5\6\0\0ij\3\4\2\0jk\5\1"+
		"\0\0kz\1\0\0\0ln\5\13\0\0mo\3\20\b\0nm\1\0\0\0no\1\0\0\0op\1\0\0\0pz\5"+
		"\f\0\0qr\5\2\0\0rt\5\6\0\0su\3\24\n\0ts\1\0\0\0tu\1\0\0\0uv\1\0\0\0vw"+
		"\5\1\0\0wz\3\6\3\0xz\3\16\7\0ya\1\0\0\0yb\1\0\0\0yc\1\0\0\0yd\1\0\0\0"+
		"ye\1\0\0\0yf\1\0\0\0yg\1\0\0\0yh\1\0\0\0yl\1\0\0\0yq\1\0\0\0yx\1\0\0\0"+
		"z\t\1\0\0\0{\177\5\25\0\0|~\3\f\6\0}|\1\0\0\0~\u0081\1\0\0\0\177}\1\0"+
		"\0\0\177\u0080\1\0\0\0\u0080\13\1\0\0\0\u0081\177\1\0\0\0\u0082\u0083"+
		"\5\3\0\0\u0083\u0084\5\25\0\0\u0084\r\1\0\0\0\u0085\u0086\3\n\5\0\u0086"+
		"\u008f\5\6\0\0\u0087\u008c\3\4\2\0\u0088\u0089\5\4\0\0\u0089\u008b\3\4"+
		"\2\0\u008a\u0088\1\0\0\0\u008b\u008e\1\0\0\0\u008c\u008a\1\0\0\0\u008c"+
		"\u008d\1\0\0\0\u008d\u0090\1\0\0\0\u008e\u008c\1\0\0\0\u008f\u0087\1\0"+
		"\0\0\u008f\u0090\1\0\0\0\u0090\u0091\1\0\0\0\u0091\u0092\5\1\0\0\u0092"+
		"\17\1\0\0\0\u0093\u0098\3\22\t\0\u0094\u0095\5\4\0\0\u0095\u0097\3\22"+
		"\t\0\u0096\u0094\1\0\0\0\u0097\u009a\1\0\0\0\u0098\u0096\1\0\0\0\u0098"+
		"\u0099\1\0\0\0\u0099\21\1\0\0\0\u009a\u0098\1\0\0\0\u009b\u009c\5\25\0"+
		"\0\u009c\u009d\5\b\0\0\u009d\u009e\3\4\2\0\u009e\23\1\0\0\0\u009f\u00a4"+
		"\5\25\0\0\u00a0\u00a1\5\4\0\0\u00a1\u00a3\5\25\0\0\u00a2\u00a0\1\0\0\0"+
		"\u00a3\u00a6\1\0\0\0\u00a4\u00a2\1\0\0\0\u00a4\u00a5\1\0\0\0\u00a5\25"+
		"\1\0\0\0\u00a6\u00a4\1\0\0\0\17\31\37\65<SU\\nty\177\u008c\u008f\u0098"+
		"\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}