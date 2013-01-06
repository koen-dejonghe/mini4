
package com.fo.mini4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface Mini4Visitor<T> {
	T visitFunctionDef(Mini4Parser.FunctionDefContext ctx);
	T visitAndExpr(Mini4Parser.AndExprContext ctx);
	T visitAssign(Mini4Parser.AssignContext ctx);
	T visitBlock(Mini4Parser.BlockContext ctx);
	T visitFloat(Mini4Parser.FloatContext ctx);
	T visitBlockLabel(Mini4Parser.BlockLabelContext ctx);
	T visitMemberDecl(Mini4Parser.MemberDeclContext ctx);
	T visitQString(Mini4Parser.QStringContext ctx);
	T visitFunctionCall(Mini4Parser.FunctionCallContext ctx);
	T visitProg(Mini4Parser.ProgContext ctx);
	T visitDef(Mini4Parser.DefContext ctx);
	T visitPrintln(Mini4Parser.PrintlnContext ctx);
	T visitReturnLabel(Mini4Parser.ReturnLabelContext ctx);
	T visitEqExpr(Mini4Parser.EqExprContext ctx);
	T visitMapExprLabel(Mini4Parser.MapExprLabelContext ctx);
	T visitQidLabel(Mini4Parser.QidLabelContext ctx);
	T visitExprLabel(Mini4Parser.ExprLabelContext ctx);
	T visitAddSubExpr(Mini4Parser.AddSubExprContext ctx);
	T visitInt(Mini4Parser.IntContext ctx);
	T visitParDefList(Mini4Parser.ParDefListContext ctx);
	T visitMapElDecl(Mini4Parser.MapElDeclContext ctx);
	T visitQid(Mini4Parser.QidContext ctx);
	T visitFunctionCallLabel(Mini4Parser.FunctionCallLabelContext ctx);
	T visitMapExpr(Mini4Parser.MapExprContext ctx);
	T visitParens(Mini4Parser.ParensContext ctx);
	T visitRelExpr(Mini4Parser.RelExprContext ctx);
	T visitPrint(Mini4Parser.PrintContext ctx);
	T visitQqString(Mini4Parser.QqStringContext ctx);
	T visitIfStatement(Mini4Parser.IfStatementContext ctx);
	T visitOrExpr(Mini4Parser.OrExprContext ctx);
	T visitMulDivExpr(Mini4Parser.MulDivExprContext ctx);
	T visitAssert(Mini4Parser.AssertContext ctx);
	T visitBool(Mini4Parser.BoolContext ctx);
	T visitBrickLabel(Mini4Parser.BrickLabelContext ctx);
	T visitIfStatementLabel(Mini4Parser.IfStatementLabelContext ctx);
	T visitNil(Mini4Parser.NilContext ctx);
}