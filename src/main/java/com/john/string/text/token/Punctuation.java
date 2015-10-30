package com.john.string.text.token;

public class Punctuation extends Token {
	private char punctuation;

	public Punctuation(String punctuation) {
		this.punctuation = punctuation.charAt(0);
	}

	@Override
	public String toString() {
		return Character.toString(punctuation);
	}
}
