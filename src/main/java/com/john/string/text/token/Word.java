package com.john.string.text.token;

import java.util.ArrayList;
import java.util.List;

import com.john.string.text.Letter;

public class Word extends Token {
	private List<Letter> letters = new ArrayList<Letter>();
	
	public Word(List<Letter> letters) {
		letters = letters;
	}
	
	private List<Letter> parseWortToLetters(String word) {
		List<Letter> letters = new ArrayList<Letter>();
		for (int count = 0; count < word.length(); count++) {
			letters.add(new Letter(word.charAt(count)));
		}
		return letters;
	}

	public String assemble() {
		String result = "";
		for (Letter letter : letters) {
			result += letter;
		}
		return result;
	}
	
}
