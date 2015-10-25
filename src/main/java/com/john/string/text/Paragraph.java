package com.john.string.text;

import java.util.List;

import com.john.string.toolstext.TextTools;

public class Paragraph {
	private List<Sentence> sentences;

	public Paragraph(String paragraph) {
		this.sentences = TextTools.processingParagraph(paragraph);
	}

	@Override
	public String toString() {
		return "123"; // TODO 
	}

}
