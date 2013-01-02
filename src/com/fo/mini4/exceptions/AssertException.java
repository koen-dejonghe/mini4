package com.fo.mini4.exceptions;

import com.fo.mini4.Mini4Parser.AssertContext;

public class AssertException extends Mini4Exception {

	public AssertException(AssertContext ctx) {
		System.err.println(ctx.getStart().getLine() + ":" + (ctx.getStart().getCharPositionInLine()+1) + ": invalid assertion: " + ctx.getText());
	}

	private static final long serialVersionUID = 1L;

}
