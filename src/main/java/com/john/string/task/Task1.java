package com.john.string.task;

import java.util.ArrayList;
import java.util.List;

import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

/**
 * Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
 */
public class Task1 implements Task {
	TextPrinter textPrinter = new TextPrinter();
	TextExtractor textExtractor = new TextExtractor();
	List<Sentence> sentences;

	@Override
	public void run(Text text) {
		List<Sentence> result = new ArrayList<Sentence>();
		sentences = textExtractor.extractAllSentence(text);

		for (Sentence sentence : sentences) {
			if (isSameWords(sentence)) {
				result.add(sentence);
			}
		}

		textPrinter.print(result);
	}

	/**
	 * Если есть одинаковые слова
	 */
	private boolean isSameWords(Sentence sentence) {
		List<Word> words = textExtractor.extractAllWordFromSentence(sentence);
		
		for (int i = 0; i < words.size(); i++) {
		for (int j = 0; j < words.size(); j++) {
			if (i != j) {
			if (words.get(i).equals(words.get(j))) {
				return true;
			}
			}
		}
		}
		return false;
	}
}
