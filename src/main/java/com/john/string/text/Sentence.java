package com.john.string.text;

import java.util.ArrayList;
import java.util.List;

import com.john.string.text.token.Token;
import com.john.string.toolstext.TextTools;

public class Sentence {
	private List<Token> compositionSentences = new ArrayList<Token>();
	
	public Sentence(List<Token> compositionSentences) {
		this.compositionSentences = compositionSentences;
	}
	
	@Override
	public String toString() {
		return compositionSentences.toString();
	}
	
	public String assembleSubparagraph() {
		String result = "";
		for (Token compositionSentence : compositionSentences) {
			result += compositionSentence.assemble();
		}
		return result;
	}
}
