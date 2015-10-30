package com.john.string.prepare.action;

import java.util.List;

public class ReplaceAction implements Action {
	private String regex;
	private String replacement;

	public ReplaceAction(String regex, String replacement) {
		this.regex = regex;
		this.replacement = replacement;
	}

	@Override
	public List<String> doAction(List<String> lines) {
		if (!lines.isEmpty()) {
			for (int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				String replaced = line.replaceAll(regex, replacement);
				lines.set(i, replaced);
			}
		}
		return lines;
	}
}
