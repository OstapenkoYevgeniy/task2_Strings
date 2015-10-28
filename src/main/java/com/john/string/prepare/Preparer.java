package com.john.string.prepare;

import java.util.List;

import com.john.string.prepare.action.Action;
import com.john.string.prepare.exeption.PreparingException;

public interface Preparer {
	List<String> prepare(List<String> lines, List<Action> actions) throws PreparingException;
}
