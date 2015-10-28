package com.john.string.parse;

import java.util.List;

import com.john.string.parse.exception.ParsingException;
import com.john.string.text.Text;

public interface Parser {
	Text parse(List<String> lines) throws ParsingException;
}
