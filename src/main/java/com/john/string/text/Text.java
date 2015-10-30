package com.john.string.text;

import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<Paragraph> {
	private List<Paragraph> paragraphs;

	public Text(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	@Override
	public Iterator<Paragraph> iterator() {
		return paragraphs.iterator();
	}
}
