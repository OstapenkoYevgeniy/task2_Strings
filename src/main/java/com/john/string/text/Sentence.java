package com.john.string.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.john.string.text.token.Token;

public class Sentence implements Iterable<Token> {
	private List<Token> tokens = new ArrayList<Token>();

	public Sentence(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	public List<Token> getTokens () {
		return tokens;
	}

	@Override
	public Iterator<Token> iterator() {
		return tokens.iterator();
	}

	@Override
	public String toString() {
		String result = "";
		for (Token token : tokens) {
			result += token;
		}
		return result;
	}
}
