package com.john.string.text;

public class Letter {
	private char letter;

	public Letter(char letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		return Character.toString(letter);
	}
}
