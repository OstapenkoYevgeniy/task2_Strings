package com.john.string.comporators;

import java.util.Comparator;

import com.john.string.text.Sentence;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class SortedByNumberOfWords implements Comparator<Sentence> {
	@Override
	public int compare(Sentence arg0, Sentence arg1) {
		int sentenceOne = getNumberOfWords(arg0);
		int sentenceTwo = getNumberOfWords(arg1);

		if (sentenceOne > sentenceTwo) {
			return 1;
		} else if (sentenceOne < sentenceTwo) {
			return -1;
		} else {
			return 0;
		}
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
