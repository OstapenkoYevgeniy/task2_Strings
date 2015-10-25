package com.john.string.toolstext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;

public class TextTools {
	public static List<Paragraph> getParagraphs(String text) {
		List<Paragraph> result = new ArrayList<Paragraph>();
		String s[] = text.split("\r\n");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].trim().replaceAll(" ", " "));
			result.add(new Paragraph(s[i].trim().replaceAll(" ", " ")));
		}
		return result;
	}

	public static List<Sentence> processingParagraph(String paragraph) {
		List<Sentence> sentences = new ArrayList<Sentence>();
		Matcher matcher = Pattern.compile("([^.!?]*[.!?])").matcher(paragraph);
		while (matcher.find()) {
			sentences.add(new Sentence(matcher.group(1)));
		}
		return sentences;
	}

	public static void processingSentence(String sentence) {
		List<String> result = new ArrayList<String>();
		String regex = "(([а-яА-Яa-zA-Z]+-[а-яА-Яa-zA-Z]+)|([а-яА-Яa-zA-Z]+)|([0-9]+)|[^а-яА-Яa-zA-Z0-9])";
		Matcher matcher = Pattern.compile(regex).matcher(sentence);
		while (matcher.find()) {
			result.add(matcher.group(1));
		}
	}

}
