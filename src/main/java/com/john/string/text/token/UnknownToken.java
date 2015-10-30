package com.john.string.text.token;

public class UnknownToken extends Token {
	private char unknownToken;

	public UnknownToken(String unknownToken) {
		this.unknownToken = unknownToken.charAt(0);
	}

	@Override
	public String toString() {
		return Character.toString(unknownToken);
	}
}
