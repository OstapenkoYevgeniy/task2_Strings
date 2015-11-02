package com.john.string.printer;

import java.util.List;

import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class TextPrinter {

	public void print(Text text) {
		String result = "";
		for (Paragraph paragraph : text) {
			for (Sentence sentence : paragraph) {
				for (Token token : sentence) {
					result += token;
				}
				result += " ";
			}
			result = result.trim();
			result += "\n";
		}
		System.out.println(result);
	}
	
	public void print(List<Sentence> sentences) {
		for (Sentence sentence : sentences) {
			System.out.println(sentence);
		}
	}

	public void printWords(List<Word> words) {
		for (Word word : words) {
			System.out.println(word);
		}
	}
}
