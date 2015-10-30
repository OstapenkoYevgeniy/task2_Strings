package com.john.string.task;

import java.util.List;

import com.john.string.comporators.SortByRatioVowel;
import com.john.string.comporators.SortedByNumberOfWords;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

public class Task7 implements Task {
	private TextPrinter textPrinter = new TextPrinter();
	private TextExtractor textExtractor = new TextExtractor();

	@Override
	public void run(Text text) {
		List<Word> result = textExtractor.extractAllWord(text);

		result.sort(new SortByRatioVowel());
		textPrinter.printWords(result);
	}
}
