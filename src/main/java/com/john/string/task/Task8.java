package com.john.string.task;

import java.util.ArrayList;
import java.util.List;

import com.john.string.comporators.SortByFirstConsonant;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

public class Task8 implements Task {
	private TextPrinter textPrinter = new TextPrinter();
	private TextExtractor textExtractor = new TextExtractor();
	
	@Override
	public void run(Text text) {
		List<Word> words = textExtractor.extractAllWord(text);
		words = getWordsWithVowels(words);
		words = isAllVowels(words);
		words.sort(new SortByFirstConsonant());
		textPrinter.printWords(words);
	}
	
	private List<Word> getWordsWithVowels(List<Word> words) {
		List<Word> result = new ArrayList<Word>();
		for (Word word : words) {
			String letter = Character.toString(word.getWord().charAt(0));
			if (letter.toUpperCase().matches("[АЕЁИОУЫЭЮЯ]")) {
				result.add(word);
			}
		}
		return result;
	}
	
	private List<Word> isAllVowels(List<Word> words) {
		List<Word> result = new ArrayList<Word>();
		for (Word word : words) {
			String strWord = word.getWord();
			for (int i = 0; i < strWord.length(); i++) {
				String letter = Character.toString(strWord.charAt(i));
				if (letter.toUpperCase().matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]")) {
					result.add(word);
					break;
				} 
			}
		}
		return result;
	}

}
