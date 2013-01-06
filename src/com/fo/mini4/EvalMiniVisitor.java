package com.fo.mini4;

import java.util.Iterator;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.fo.mini4.Mini4Parser.ExprContext;
import com.fo.mini4.Mini4Parser.QqStringContext;
import com.fo.mini4.exceptions.AssertException;
import com.fo.mini4.exceptions.UndefinedFunctionException;
import com.fo.mini4.exceptions.UndefinedVariableException;

public class EvalMiniVisitor extends Mini4BaseVisitor<Gizmo> {

	public GizmoMemory globalScope = new GizmoMemory();
	public GizmoMemory currentScope = new GizmoMemory();

	@Override
	public Gizmo visitProg(Mini4Parser.ProgContext ctx) {
		currentScope = globalScope;
		return visitChildren(ctx);
	}

	@Override
	public Gizmo visitBlockLabel(Mini4Parser.BlockLabelContext ctx) {
		GizmoMemory tmpScope = currentScope;
		currentScope = new GizmoMemory();
		currentScope.parentScope = tmpScope;
		Gizmo block = visitChildren(ctx);
		currentScope = tmpScope;
		return block;
	}

	@Override
	public Gizmo visitDef(Mini4Parser.DefContext ctx) {
		String id = ctx.ID().getText();
		ExprContext expr = ctx.expr();
		if (expr == null) {
			currentScope.put(id, new Gizmo());
		} else {
			currentScope.put(id, visit(expr));
		}
		return null;
	}

	@Override
	public Gizmo visitAssign(Mini4Parser.AssignContext ctx) {
		Gizmo key = visit(ctx.qid()); // don't worry if key is undefined, will
										// have thrown an UnDefExc
		Gizmo value = visit(ctx.expr());
		key.core = value.core;
		return key;
	}

	@Override
	public Gizmo visitInt(Mini4Parser.IntContext ctx) {
		Gizmo gizmo = new Gizmo();
		gizmo.core = Integer.valueOf(ctx.INT().getText());
		return gizmo;
	}

	@Override
	public Gizmo visitQString(Mini4Parser.QStringContext ctx) {
		Gizmo gizmo = new Gizmo();
		String qstring = ctx.Q_STRING().getText();
		gizmo.core = qstring.replaceAll("^\'|\'$", "");
		return gizmo;
	}

	@Override
	public Gizmo visitQqString(QqStringContext ctx) {
		Gizmo gizmo = new Gizmo();
		String qstring = ctx.QQ_STRING().getText();
		gizmo.core = qstring.replaceAll("^\"|\"$", "");
		return gizmo;
	}

	@Override
	public Gizmo visitPrintln(Mini4Parser.PrintlnContext ctx) {
		Gizmo expr = visit(ctx.expr());
		System.out.println(expr);
		return null;
	}

	@Override
	public Gizmo visitPrint(Mini4Parser.PrintContext ctx) {
		Gizmo expr = visit(ctx.expr());
		System.out.print(expr);
		return null;
	}

	@Override
	public Gizmo visitAssert(Mini4Parser.AssertContext ctx) {
		Gizmo expr = visit(ctx.expr());
		Boolean b = expr.booleanValue();
		if (!b) {
			throw new AssertException(ctx);
		}
		return null;
	}

	@Override
	public Gizmo visitEqExpr(Mini4Parser.EqExprContext ctx) {
		Gizmo left = visit(ctx.expr(0)); // get value of left subexpression
		Gizmo right = visit(ctx.expr(1)); // get value of right subexpression

		if (ctx.op.getType() == Mini4Parser.EQ) {
			return left.eq(right);
		} else {
			return left.ne(right);
		}
	}

	@Override
	public Gizmo visitAddSubExpr(Mini4Parser.AddSubExprContext ctx) {
		Gizmo left = visit(ctx.expr(0)); // get value of left subexpression
		Gizmo right = visit(ctx.expr(1)); // get value of right subexpression

		if (ctx.op.getType() == Mini4Parser.ADD) {
			return left.add(right);
		} else {
			return left.sub(right);
		}
	}

	@Override
	public Gizmo visitBool(Mini4Parser.BoolContext ctx) {
		Gizmo gizmo = new Gizmo();
		gizmo.core = Boolean.valueOf(ctx.BOOL().getText());
		return gizmo;
	}

	@Override
	public Gizmo visitNil(Mini4Parser.NilContext ctx) {
		return null;
	}

	@Override
	public Gizmo visitMapExprLabel(Mini4Parser.MapExprLabelContext ctx) {
		Gizmo map = new Gizmo();
		GizmoMemory mapScope = new GizmoMemory();
		map.core = mapScope;

		GizmoMemory tmpMemory = currentScope;
		currentScope = mapScope;
		visitChildren(ctx);
		currentScope = tmpMemory;

		return map;
	}

	@Override
	public Gizmo visitMapElDecl(Mini4Parser.MapElDeclContext ctx) {
		Gizmo value = visit(ctx.expr());
		String id = ctx.ID().getText();
		currentScope.put(id, value);
		return value;

	}

	@Override
	public Gizmo visitQid(Mini4Parser.QidContext ctx) {
		String id = ctx.ID().getText();
		Gizmo qid = currentScope.get(id);

		if (qid == null) {
			throw new UndefinedVariableException(ctx);
		}

		// when no postfix defined
		if (ctx.getChildCount() == 1) {
			return qid;
		}

		// now visit the postfix
		GizmoMemory tmpScope = currentScope;
		currentScope = qid.scopeValue();
		Gizmo member = visitChildren(ctx);
		currentScope = tmpScope;
		return member;
	}

	@Override
	public Gizmo visitMemberDecl(Mini4Parser.MemberDeclContext ctx) {
		String id = ctx.ID().getText();
		Gizmo member = currentScope.get(id);

		// if a member does not exist then create it dynamically
		if (member == null) {
			member = new Gizmo();
			currentScope.put(id, member);
		}
		return member;
	}

	@Override
	public Gizmo visitFunctionDef(Mini4Parser.FunctionDefContext ctx) {
		Gizmo function = new Gizmo();
		if (ctx.parDefList() != null) {
			// scope of function defined by visiting pardeflist
			function.scope = visit(ctx.parDefList()).scope;
		} else {
			function.scope = new GizmoMemory();
		}

		function.core = ctx;
		return function;
	}

	@Override
	public Gizmo visitParDefList(Mini4Parser.ParDefListContext ctx) {
		GizmoMemory functionScope = new GizmoMemory();
		for (TerminalNode<Token> token : ctx.ID()) {
			functionScope.put(token.getText(), new Gizmo());
		}

		Gizmo formalParameters = new Gizmo();
		formalParameters.scope = functionScope;

		return formalParameters;
	}

	@Override
	public Gizmo visitFunctionCall(Mini4Parser.FunctionCallContext ctx) {

		Gizmo function = visit(ctx.qid());

		// check if it's really a function
		Mini4Parser.FunctionDefContext functionContext = function
				.functionValue();
		if (functionContext == null) {
			throw new UndefinedFunctionException(function.name
					+ " is not a function", ctx);
		}

		GizmoMemory functionScope = new GizmoMemory();

		// function must be known in parentScope
		// required for recursive functions
		functionScope.parentScope = new GizmoMemory();
		functionScope.parentScope.put(function.name, function);

		// first copy all the names of the scope
		functionScope.putAll(function.scope);

		Iterator<String> it = functionScope.keySet().iterator();

		// assign positional values of the actual parameters
		for (ExprContext actualParContext : ctx.expr()) {
			if (it.hasNext()) {
				String formalParName = it.next();
				Gizmo actualParValue = visit(actualParContext);

				// if we want functions to act locally (parameters passed by
				// value)
				// then we should create a new gizmo here with name =
				// formalParName and core = actualParValue.core

				// if we want parameters to be passed by reference, then we can
				// use actualParValue directly
				functionScope.put(formalParName, actualParValue);
			} else {
				break;
			}
		}

		GizmoMemory cscope = currentScope;
		currentScope = functionScope;

		Gizmo rtv = new Gizmo();
		try {
			visit(functionContext.block());
		} catch (Return r) {
			rtv = r.value;
		}

		currentScope = cscope;
		return rtv;
	}

	@Override
	public Gizmo visitReturnLabel(Mini4Parser.ReturnLabelContext ctx) {
		Return returnValue = new Return();
		if (ctx.expr() != null) {
			returnValue.value = visit(ctx.expr());
		}
		throw returnValue;
	}

	@Override
	public Gizmo visitIfStatement(Mini4Parser.IfStatementContext ctx) {
		Gizmo bg = visit(ctx.expr());
		Boolean b = bg.booleanValue();
		if (b) {
			return visit(ctx.block(0));
		} else if (ctx.block(1) != null) {
			return visit(ctx.block(1));
		}
		return null;
	}

	@Override
	public Gizmo visitOrExpr(Mini4Parser.OrExprContext ctx) {
		Gizmo b1 = visit(ctx.expr(0));
		Gizmo b2 = visit(ctx.expr(1));
		Gizmo r = new Gizmo();
		r.core = b1.booleanValue() || b2.booleanValue();
		return r;
	}

	@Override
	public Gizmo visitAndExpr(Mini4Parser.AndExprContext ctx) {
		Gizmo b1 = visit(ctx.expr(0));
		Gizmo b2 = visit(ctx.expr(1));
		Gizmo r = new Gizmo();
		r.core = b1.booleanValue() && b2.booleanValue();
		return r;
	}

}
