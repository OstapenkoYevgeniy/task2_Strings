package com.john.string.text;

import java.util.Iterator;
import java.util.List;

import com.john.string.toolstext.TextTools;

public class Paragraph implements Iterable<Sentence>{
	private List<Sentence> sentences;

	public Paragraph(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	@Override
	public String toString() {
		return sentences.toString(); // TODO 
	}

	public String assembleSubparagraph() {
		String result = "";
		for (Sentence sentence : sentences) {
			result += sentence.assembleSubparagraph();
		}
		return result;
	}

	@Override
	public Iterator<Sentence> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
