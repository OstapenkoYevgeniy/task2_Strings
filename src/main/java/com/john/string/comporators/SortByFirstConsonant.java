package com.john.string.comporators;

import java.util.Comparator;
import java.util.Iterator;

import com.john.string.text.token.Word;

public class SortByFirstConsonant implements Comparator<Word>{

	@Override
	public int compare(Word o1, Word o2) {
		char wordOne = getFirstConsonant(o1);
		char wordTwo = getFirstConsonant(o2);
		return Character.compare(wordOne, wordTwo);
	}
	
	private char getFirstConsonant(Word word) {
		String strWord = word.getWord();
		for (int i = 0; i < strWord.length(); i++) {
			String letter = Character.toString(strWord.charAt(i));
			if (letter.toUpperCase().matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]")) {
				return letter.charAt(0);
			}
		}
		return ' ';
	}
}
