package com.john.string.comporators;

import java.util.Comparator;

import com.john.string.text.Sentence;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class SortedByNumberOfWords implements Comparator<Sentence> {
	@Override
	public int compare(Sentence arg0, Sentence arg1) {
		Integer sentenceOne = getNumberOfWords(arg0);
		Integer sentenceTwo = getNumberOfWords(arg1);

		return sentenceOne.compareTo(sentenceTwo);
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
