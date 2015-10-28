package com.john.string.prepare.action;

import java.util.Iterator;
import java.util.List;

public class DeleteEmptyLinesAction implements Action {
	@Override
	public List<String> doAction(List<String> lines) {
		if (!lines.isEmpty()) {
			Iterator<String> it = lines.iterator();
			while (it.hasNext()) {
				String line = it.next();
				if (line.isEmpty()) {
					it.remove();
				}
			}
		}
		return lines;
	}
}
