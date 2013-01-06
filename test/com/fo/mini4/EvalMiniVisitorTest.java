package com.fo.mini4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import com.fo.mini4.exceptions.AssertException;
import com.fo.mini4.exceptions.UndefinedFunctionException;
import com.fo.mini4.exceptions.UndefinedVariableException;

public class EvalMiniVisitorTest {

	@Test
	public void testAssignInteger() {

		String program = "def a = 5;";

		EvalMiniVisitor eval = interp(program);
		Gizmo gizmo = eval.globalScope.get("a");
		int value = gizmo.integerValue();

		assertEquals(5, value);
	}

	@Test
	public void testBlock() {

		String program = "def a = 5; { def b = 7; a = 3;} ";

		EvalMiniVisitor eval = interp(program);

		Gizmo a = eval.globalScope.get("a");
		int value = a.integerValue();
		assertEquals(3, value);

		Gizmo b = eval.globalScope.get("b");
		assertNull(b);
	}

	@Test
	public void testUnDefException() {
		String program = "a = b;";
		try {
			interp(program);
		} catch (UndefinedVariableException e) {
			return;
		}
		fail("should have thrown UndefinedVariableException");
	}

	@Test
	public void testAssertTrue() {
		String program = "assert true;";
		interp(program);
	}

	@Test
	public void testAssertFalse() {
		String program = "assert false;";
		try {
			interp(program);
		} catch (AssertException e) {
			return;
		}
		fail("should have thrown an AssertException");
	}

	@Test
	public void testBlockWithAssert() {
		String program = "def a = 5; def b; "
				+ "{ assert a == 5; def b = 7; a = 3; } "
				+ "assert b == nil; assert a == 3; ";
		interp(program);
	}

	@Test
	public void testMapDeclaration() {
		String program = "def m = { e1=3, e2=4 }; assert m != nil; ";
		interp(program);
	}

	@Test
	public void testMapRef() {
		String program = "def m = { e1=3, e2=4 }; assert m.e1 == 3;\n"
				+ "def a = m.e2; assert a == 4;\n"
				+ "a = 5; println m.e2; assert m.e2 == 5;\n"
				// TODO is above correct ?
				// this makes everything a pointer,
				// including primitives
				+ "a = m; assert a.e1 == 3;\n"
				+ "a.e1 = 6; assert m.e1 == 6;\n";
		interp(program);
	}

	@Test
	public void testDynamicMapDeclaration() {
		String program = "m.e1 = 3;";
		try {
			interp(program);
		} catch (UndefinedVariableException e) {
			return;
		}
		fail("should have thrown a UndefinedVariableException");
	}

	@Test
	public void testDef() {

		String program = "def a = 5; assert a == 5; def b; b = 3; assert b == 3;";

		EvalMiniVisitor eval = interp(program);
		Gizmo gizmo = eval.globalScope.get("a");
		int value = gizmo.integerValue();

		assertEquals(5, value);
	}

	@Test
	public void testFunctionDef() {
		String program = "def f = function(a){a=4;};";
		interp(program);
	}

	@Test
	public void testFunctionCallParametersPassedByReference() {
		String program = "def f = function(a){assert a == 1; a=4;};"
				+ "def b = 1;" + "f(b);" + "println b; assert b == 4;";
		interp(program);
	}

	@Test
	public void testFunctionCallNoParameters() {
		String program = "def f = function(){def b = 3;};" + "def b = 1;"
				+ "f();" + "assert b == 1;";
		interp(program);
	}

	@Test
	public void testFunctionCallMultipleParameters() {
		String program = "def f = function(a, b){assert a == 4; assert b == 5;};"
				+ "f(4, 5);";
		interp(program);
	}

	@Test
	public void testFunctionCallParameterMismatch() {
		String program = "def f = function(a, b){assert a == 4; assert b == nil;};"
				+ "f(4);";
		interp(program);
	}

	@Test
	public void testFunctionCallNonExist() {
		String program = "def x = function(a, b){assert a == 4; assert b == nil;};"
				+ "f(4);";
		try {
			interp(program);
		} catch (UndefinedVariableException e) {
			return;
		}
		fail("should have thrown UndefinedVariableException");
	}

	@Test
	public void testFunctionCallParameterNotFunction() {
		String program = "def f = 34;" + "f(4);";
		try {
			interp(program);
		} catch (UndefinedFunctionException e) {
			return;
		}
		fail("should have thrown UndefinedFunctionException");
	}

	@Test
	public void testMultipleFunctionCalls() {
		String program = "def x = 27;"
				+ "def f = function(a, b) { println a; println b; }; "
				+ "f(4, 5); " + " f(3); " + "assert x == 27; ";
		interp(program);
	}

	@Test
	public void testReturnFromFunction() {
		String program = "def f = function(a, b) { return a + b; }; "
				+ "def c = f(4, 5); " + "println c; assert c == 9; ";
		interp(program);
	}

	@Test
	public void functionAsParameter() {
		String program = "def f = function(a, b) { return a + b; }; "
				+ "def g = function(fun, x, y) { return fun(x, y) + fun(x, y); }; "
				+ "def c = g(f, 4, 5); "
				+ "println g(f, 4, 5); assert c == 18; ";
		interp(program);
	}

	@Test
	public void functionReturningFunction() {
		String program = "def f = function() { def g = function(x, y) {return x + y;}; return g; }; "
				+ "def h = f(); "
				+ "println h(4, 5); "
				+ "assert h(4, 5) == 9; ";
		interp(program);
	}

	@Test
	public void memberFunction() {
		String program = "def m = {f = function(a, b) { return a + b; } };"
				+ "def g = m.f; assert g(3, 4) == 7;";
		interp(program);
	}

	@Test
	public void memberFunctionCall() {
		String program = "def m = {f = function(a, b) { return a + b; }, x = 3, y = 4 };"
				+ "assert m.f(m.x, m.y) == 7;";
		interp(program);
	}

	@Test
	public void memberFunctionCallUsingMapScope() {
		String program = "def m = {x = 3, y = 4, f = function() { return x + y; } };"
				+ "assert m.f() == 7;";
		try {
			interp(program);
		} catch (UndefinedVariableException e) {
			return;
		}
		fail("should have thrown UndefinedVariableException");
	}

	@Test
	public void memberFunctionCallUsingParentScope() {
		String program = "def m = {f = function() { return x + y; } };"
				+ "def x = 3; def y = 4; assert m.f() == 7;";
		try {
			interp(program);
		} catch (UndefinedVariableException e) {
			return;
		}
		fail("should have thrown UndefinedVariableException");
	}

	@Test
	public void ifThenStatement() {
		String program = "if (false) { assert false; }";
		interp(program);
	}

	@Test
	public void ifThenElseStatement() {
		String program = "if (false) { assert false; } else { print 'true'; }";
		interp(program);
	}

	@Test
	public void recursiveFunctionCall() {
		String program = "def fib = function (n) { \n"
				+ "if (n == 0 || n == 1) { return n; } \n"
				+ "else { return fib(n - 1) + fib(n - 2); } \n};"
				+ " def c = fib(10); println 'c = ' + c; assert c == 55;";
		interp(program);
	}

	@Test
	public void addIntegers() {
		String program = "assert 3 + 4 == 7;";
		interp(program);
	}

	@Test
	public void addStringInteger() {
		String program = "assert 'aaa' + 4 == 'aaa4'; assert 4 + 'aaa' == '4aaa';";
		interp(program);
	}

	@Test
	public void addStringString() {
		String program = "assert 'aaa' + 'bbb' == 'aaabbb' ;";
		interp(program);
	}

	private EvalMiniVisitor interp(String program) {
		ANTLRInputStream input = new ANTLRInputStream(program);
		Mini4Lexer lexer = new Mini4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Mini4Parser parser = new Mini4Parser(tokens);
		ParseTree tree = parser.prog();
		EvalMiniVisitor eval = new EvalMiniVisitor();
		eval.visit(tree);
		return eval;
	}

}
