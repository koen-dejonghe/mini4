
package com.fo.mini4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class Mini4BaseVisitor<T> extends ParseTreeVisitor<T> implements Mini4Visitor<T> {
	@Override public T visitFunctionDef(Mini4Parser.FunctionDefContext ctx) { return visitChildren(ctx); }
	@Override public T visitAndExpr(Mini4Parser.AndExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitAssign(Mini4Parser.AssignContext ctx) { return visitChildren(ctx); }
	@Override public T visitBlock(Mini4Parser.BlockContext ctx) { return visitChildren(ctx); }
	@Override public T visitFloat(Mini4Parser.FloatContext ctx) { return visitChildren(ctx); }
	@Override public T visitBlockLabel(Mini4Parser.BlockLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitMemberDecl(Mini4Parser.MemberDeclContext ctx) { return visitChildren(ctx); }
	@Override public T visitQString(Mini4Parser.QStringContext ctx) { return visitChildren(ctx); }
	@Override public T visitFunctionCall(Mini4Parser.FunctionCallContext ctx) { return visitChildren(ctx); }
	@Override public T visitProg(Mini4Parser.ProgContext ctx) { return visitChildren(ctx); }
	@Override public T visitDef(Mini4Parser.DefContext ctx) { return visitChildren(ctx); }
	@Override public T visitPrintln(Mini4Parser.PrintlnContext ctx) { return visitChildren(ctx); }
	@Override public T visitReturnLabel(Mini4Parser.ReturnLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitEqExpr(Mini4Parser.EqExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitMapExprLabel(Mini4Parser.MapExprLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitQidLabel(Mini4Parser.QidLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitAddSubExpr(Mini4Parser.AddSubExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitExprLabel(Mini4Parser.ExprLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitInt(Mini4Parser.IntContext ctx) { return visitChildren(ctx); }
	@Override public T visitParDefList(Mini4Parser.ParDefListContext ctx) { return visitChildren(ctx); }
	@Override public T visitMapElDecl(Mini4Parser.MapElDeclContext ctx) { return visitChildren(ctx); }
	@Override public T visitQid(Mini4Parser.QidContext ctx) { return visitChildren(ctx); }
	@Override public T visitFunctionCallLabel(Mini4Parser.FunctionCallLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitMapExpr(Mini4Parser.MapExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitParens(Mini4Parser.ParensContext ctx) { return visitChildren(ctx); }
	@Override public T visitRelExpr(Mini4Parser.RelExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitPrint(Mini4Parser.PrintContext ctx) { return visitChildren(ctx); }
	@Override public T visitQqString(Mini4Parser.QqStringContext ctx) { return visitChildren(ctx); }
	@Override public T visitOrExpr(Mini4Parser.OrExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitMulDivExpr(Mini4Parser.MulDivExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitAssert(Mini4Parser.AssertContext ctx) { return visitChildren(ctx); }
	@Override public T visitBool(Mini4Parser.BoolContext ctx) { return visitChildren(ctx); }
	@Override public T visitBrickLabel(Mini4Parser.BrickLabelContext ctx) { return visitChildren(ctx); }
	@Override public T visitNil(Mini4Parser.NilContext ctx) { return visitChildren(ctx); }
}