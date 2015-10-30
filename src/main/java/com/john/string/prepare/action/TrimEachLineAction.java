package com.john.string.prepare.action;

import java.util.List;

public class TrimEachLineAction implements Action {

	@Override
	public List<String> doAction(List<String> lines) {
		if (!lines.isEmpty()) {
			for (int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				lines.set(i, line.trim());
			}
		}
		return lines;
	}
}