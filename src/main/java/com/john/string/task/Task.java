package com.john.string.task;

import com.john.string.parse.exception.ParsingException;
import com.john.string.text.Text;

public interface Task {
	void run(Text text) throws ParsingException;
}
