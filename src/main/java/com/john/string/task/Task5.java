package com.john.string.task;

import java.util.ArrayList;
import java.util.List;

import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class Task5 implements Task {
	TextPrinter textPrinter = new TextPrinter();
	TextExtractor textExtractor = new TextExtractor();
	List<Sentence> sentences;

	@Override
	public void run(Text text) {

		List<Sentence> result = textExtractor.extractAllSentence(text);

		for (Sentence sentence : result) {
			int min = 9999;
			int max = 0;
			List<Token> tokens = sentence.getTokens();

			for (int i = 0; i < tokens.size(); i++) {
				if (tokens.get(i) instanceof Word) {
					if (min > i)
						min = i;
					if (max < i)
						max = i;
				}
			}

			Token tmpToken = tokens.get(min);
			tokens.set(min, tokens.get(max));
			tokens.set(max,tmpToken);
		}

		textPrinter.print(result);
	}
}
