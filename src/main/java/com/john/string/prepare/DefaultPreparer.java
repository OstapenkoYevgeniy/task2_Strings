package com.john.string.prepare;

import java.util.List;

import com.john.string.prepare.action.Action;
import com.john.string.prepare.exeption.PreparingException;

public class DefaultPreparer implements Preparer {

	@Override
	public List<String> prepare(List<String> lines, List<Action> actions) throws PreparingException {
		if (!actions.isEmpty()) {
			for (Action action : actions) {
				lines = action.doAction(lines);
			}
		}
		return lines;
	}
}
