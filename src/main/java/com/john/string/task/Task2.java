package com.john.string.task;

import java.util.ArrayList;
import java.util.List;

import com.john.string.comporators.SortedByNumberOfWords;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;

public class Task2 implements Task {
	private TextPrinter textPrinter = new TextPrinter();
	private TextExtractor textExtractor = new TextExtractor();

	@Override
	public void run(Text text) {
		List<Sentence> result = textExtractor.extractAllSentence(text);
		result.sort(new SortedByNumberOfWords());
		textPrinter.print(result);
	}
}
