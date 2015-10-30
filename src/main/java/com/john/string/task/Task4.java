package com.john.string.task;

import java.util.ArrayList;
import java.util.List;

import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class Task4 implements Task {
	private TextPrinter textPrinter = new TextPrinter();
	private TextExtractor textExtractor = new TextExtractor();

	private int from;
	private int before;

	public Task4(int from, int before) {
		this.from = from;
		this.before = before;
	}

	@Override
	public void run(Text text) {
		List<Sentence> sentences = getInterrogativeSentences(textExtractor.extractAllSentence(text));

		List<Word> words = getWordsWithoutRepetition(sentences);
		words = getWordsGivenLength(words);
		System.out.println(words);
	}

	private List<Sentence> getInterrogativeSentences(List<Sentence> sentences) {
		List<Sentence> result = new ArrayList<Sentence>();
		for (Sentence sentence : sentences) {
			List<Token> tokens = sentence.getTokens();
			if (tokens.get(tokens.size() - 1).toString().equals("?")) {
				result.add(sentence);
			}
		}
		return result;
	}

	private List<Word> getWordsWithoutRepetition(List<Sentence> sentences) {
		List<Word> allWords = new ArrayList<Word>();
		List<Word> result = new ArrayList<Word>();

		for (Sentence sentence : sentences) {
			for (Token token : sentence) {
				if (token instanceof Word) {
					allWords.add((Word) token);
				}
			}
		}
		// TODO надо разбить на два метода
		for (Word word : allWords) {
			if (!isSameWords(result, word)) {
				result.add(word);
			}
		}

		return result;
	}

	private List<Word> getWordsGivenLength(List<Word> words) {
		List<Word> result = new ArrayList<Word>();
		for (Word word : words) {
			int wordLength = word.toString().length();
			if (wordLength >= from && wordLength <= before) {
				result.add(word);
			}
		}
		return result;
	}

	private boolean isSameWords(List<Word> words, Word word) {
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals(word)) {
				return true;
			}
		}
		return false;
	}
}
