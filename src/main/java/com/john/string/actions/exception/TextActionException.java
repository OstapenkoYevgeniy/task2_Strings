package com.john.string.actions.exception;

public class TextActionException extends Exception {
	public TextActionException(String message) {
		super(message);
	}

	public TextActionException(String message, Throwable cause) {
		super(message, cause);
	}
}
