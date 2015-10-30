package com.john.string.task;

import java.util.Arrays;
import java.util.List;

import com.john.string.comporators.SortByAlphabetically;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class Task6 implements Task{
	TextPrinter textPrinter = new TextPrinter();
	TextExtractor textExtractor = new TextExtractor();
	List<Sentence> sentences;

	@Override
	public void run(Text text) {
		List<Word> result = textExtractor.extractAllWord(text);
		result.sort(new SortByAlphabetically());
		printAccordingToTask(result);
	}
	 
	 public void printAccordingToTask(List<Word> words) {
		char tmpLetter = ' ';
		for (Word word : words) {
			char firstLetter = word.toString().toLowerCase().charAt(0);
			if (tmpLetter != firstLetter) {
				tmpLetter = firstLetter;
				System.out.println("  " + word);
			} else {
				System.out.println(word);
			}
		}
	 }
}
