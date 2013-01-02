package com.fo.mini4.exceptions;

import org.antlr.v4.runtime.ParserRuleContext;

public class Mini4Exception extends Error {

	private static final long serialVersionUID = 1L;

	public Mini4Exception() {
		super();
	}

	public Mini4Exception(String message) {
		super(message);
	}

	public Mini4Exception(Throwable cause) {
		super(cause);
	}

	public Mini4Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Mini4Exception(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public Mini4Exception(ParserRuleContext<?> ctx) {
		System.err.println(ctx.getStart().getLine() + ":"
				+ (ctx.getStart().getCharPositionInLine() + 1)
				+ ": " + ctx.getText());
	}

	public Mini4Exception(String message, ParserRuleContext<?> ctx) {
		System.err.println(ctx.getStart().getLine() + ":"
				+ (ctx.getStart().getCharPositionInLine() + 1)
				+ ": " + message + ": " + ctx.getText());
	}


}