package com.john.string.text.token;

import java.util.ArrayList;
import java.util.List;

import com.john.string.text.Letter;

public class Word extends Token {
	private List<Letter> letters = new ArrayList<Letter>();

	public Word(List<Letter> letters) {
		this.letters = letters;
	}

	public String getWord() {
		String result = "";
		for (Letter letter : letters) {
			result += letter;
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "";
		for (Letter letter : letters) {
			result += letter;
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		String wordOne = this.getWord().toLowerCase();
		Word other = (Word) obj;
		String wordTwo = other.getWord().toLowerCase();
		if (wordOne.equals(wordTwo)) {
			return true;
		} else {
			return false;
		}
	}
}
