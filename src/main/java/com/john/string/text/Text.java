package com.john.string.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private List<Paragraph> paragraphs;

	public Text(List<String> paragraphs) {
		this.paragraphs = processingString(paragraphs);
	}

	@Override
	public String toString() {
		String result = "";
		for (Paragraph paragraph : paragraphs) {
			result = paragraph + "\n";
		}
		return result;
	}

	private List<Paragraph> processingString(List<String> paragraphs) {
		List<Paragraph> result = new ArrayList<Paragraph>();
		for (String paragraph : paragraphs) {
			String processingString = paragraph.trim();
			for (int count = 0; count < 5; count++) {
				processingString = processingString.replaceAll("  ", " ");
			}
			if (!processingString.equals("")) {
				result.add(new Paragraph(processingString));
			}
		}
		return result;
	}
}
