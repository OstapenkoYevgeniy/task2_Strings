package com.john.string.toolstext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.john.string.text.Paragraph;
import com.john.string.text.token.Number;
import com.john.string.text.token.Punctuation;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;
import com.john.string.text.Sentence;

public class TextTools {
//	public static List<Paragraph> getParagraphs(String text) {
//		List<Paragraph> result = new ArrayList<Paragraph>();
//		String s[] = text.split("\r\n");
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i].trim().replaceAll(" ", " "));
//			//result.add(new Paragraph(s[i].trim().replaceAll(" ", " ")));
//		}
//		return result;
//	}
//
//	// TODO добавить еще поиск по многоточию конца предложения
//	public static List<Sentence> processingParagraph(String paragraph) {
//		List<Sentence> sentences = new ArrayList<Sentence>();
//		Matcher matcher = Pattern.compile("([^.!?]*[.!?])").matcher(paragraph);
//		while (matcher.find()) {
//			sentences.add(new Sentence(matcher.group(1)));
//		}
//		return sentences;
//	}
//
//	public static List<Token> processingSentence(String sentence) {
//		List<String> result = new ArrayList<String>();
//		String regex = "(([а-яА-Яa-zA-Z]+-[а-яА-Яa-zA-Z]+)|([а-яА-Яa-zA-Z]+)|([0-9]+)|[^а-яА-Яa-zA-Z0-9])";
//		Matcher matcher = Pattern.compile(regex).matcher(sentence);
//		while (matcher.find()) {
//			result.add(matcher.group(1));
//		}
//
//		return compositionSentence(result);
//	}
//
//	private static List<Token> compositionSentence(List<String> result) {
//		List<Token> compositionSentence = new ArrayList<Token>();
//		Pattern ifWord = Pattern.compile("(([а-яА-Яa-zA-Z]+-[а-яА-Яa-zA-Z]+)|([а-яА-Яa-zA-Z]+))");  
//		Pattern ifNumber = Pattern.compile("([0-9]+)");  
//		Pattern ifPunctuation = Pattern.compile("[^а-яА-Яa-zA-Z0-9]");  
//		
//		for (String part : result) {
//			if (ifWord.matcher(part).matches()) {
//				compositionSentence.add(new Word(part));
//			} else if (ifNumber.matcher(part).matches()) {
//				compositionSentence.add(new Number(part));
//			} else if (ifPunctuation.matcher(part).matches()) {
//				compositionSentence.add(new Punctuation(part));
//			} else {
//				System.out.println("Совпадений не найдено!!!! ***************************************");
//			}
//		}
//		return compositionSentence;
//	}

}
