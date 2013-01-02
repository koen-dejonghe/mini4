package com.fo.mini4.exceptions;

import org.antlr.v4.runtime.ParserRuleContext;


public class UndefinedVariableException extends Mini4Exception {
	public UndefinedVariableException(ParserRuleContext<?> ctx) {
		super(ctx);
	}

	private static final long serialVersionUID = 1L;

}
