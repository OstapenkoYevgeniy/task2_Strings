package com.john.string.comporators;

import java.util.Comparator;

import com.john.string.text.Sentence;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class SortByAlphabetically implements Comparator<Word> {
	@Override
	public int compare(Word arg0, Word arg1) {
		String charOne = arg0.getWord().substring(0, 1).toLowerCase();
		String charTwo =  arg1.getWord().substring(0, 1).toLowerCase();

		return charOne.compareTo(charTwo);
	}

	private int getNumberOfWords(Sentence sentence) {
		int result = 0;
		for (Token token : sentence) {
			if (token instanceof Word) {
				result++;
			}
		}
		return result;
	}
}
