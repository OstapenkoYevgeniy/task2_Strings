package com.john.string.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.john.string.parse.exception.ParsingException;
import com.john.string.text.Letter;
import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Punctuation;
import com.john.string.text.token.Token;
import com.john.string.text.token.UnknownToken;
import com.john.string.text.token.Word;
import com.john.string.text.token.Number;

public class SimpleParser implements Parser {
	private List<Paragraph> listParagraph = new ArrayList<Paragraph>();

	// lines == paragraph
	@Override
	public Text parse(List<String> lines) throws ParsingException {
		for (String paragraph : lines) {
			listParagraph.add(paragraphToSentence(paragraph));
		}
		return new Text(listParagraph);
	}

	private Paragraph paragraphToSentence(String text) throws ParsingException {
		List<Sentence> listSentence = new ArrayList<Sentence>();
		String regex = "([^.!?]*([.]{3}|[.!?]))";
		Matcher matcher = Pattern.compile(regex).matcher(text);
		while (matcher.find()) {
			listSentence.add(SentenceToToken(matcher.group(1).trim()));
		}
		return new Paragraph(listSentence);
	}

	private Sentence SentenceToToken(String sentence) throws ParsingException {
		List<Token> listToken = new ArrayList<Token>();
		String regex = "(([а-яА-Яa-zA-Z]+-[а-яА-Яa-zA-Z]+)|([а-яА-Яa-zA-Z]+)|([0-9]+)|[^а-яА-Яa-zA-Z0-9])";

		String isWord = "([а-яА-Яa-zA-Z]+-[а-яА-Яa-zA-Z]+)|([а-яА-Яa-zA-Z]+)";
		String isNumber = "[0-9]+";
		String isPunktuation = "[’'/[/](){}:;,-.!?\" ]";
		
		Matcher matcher = Pattern.compile(regex).matcher(sentence);
		while (matcher.find()) {
			if (matcher.group(1).matches(isWord)) {
				listToken.add(new Word(letterToWord(matcher.group(1))));
			} else if (matcher.group(1).matches(isNumber)) {
				listToken.add(new Number(matcher.group(1)));
			} else if (matcher.group(1).matches(isPunktuation)) {
				listToken.add(new Punctuation(matcher.group(1)));
			} else {
				listToken.add(new UnknownToken(matcher.group(1)));
			}
		}
		return new Sentence(listToken);
	}

	private List<Letter> letterToWord(String word) {
		List<Letter> listLetter = new ArrayList<Letter>();
		for (int count = 0; count < word.length(); count++) {
			listLetter.add(new Letter(word.charAt(count)));
		}
		return listLetter;
	}
}
