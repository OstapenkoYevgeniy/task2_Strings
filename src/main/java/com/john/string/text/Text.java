package com.john.string.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<Paragraph>{
	private List<Paragraph> paragraphs;

	public Text(List<Paragraph> paragraphs) {
		//System.out.println(paragraphs);
		this.paragraphs = paragraphs;
	}

	@Override
	public String toString() {
		return paragraphs.toString();
	}


	
	public String assembleText() {
		String result = "";
		for (Paragraph subparagraph : paragraphs) {
			result += subparagraph.assembleSubparagraph() + "\n";
		}
		return result;
	}

	@Override
	public Iterator<Paragraph> iterator() {
		Iterator<Paragraph> iprof = paragraphs.iterator();
        return iprof; 
	}
}
