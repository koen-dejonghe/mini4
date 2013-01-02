package com.fo.mini4.exceptions;

import com.fo.mini4.Mini4Parser.FunctionCallContext;

public class UndefinedFunctionException extends Mini4Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UndefinedFunctionException(String message, FunctionCallContext ctx) {
		super(message, ctx);
	}

}
