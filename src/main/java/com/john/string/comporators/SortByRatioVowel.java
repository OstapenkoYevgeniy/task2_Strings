package com.john.string.comporators;

import java.util.Comparator;

import com.john.string.text.token.Word;

public class SortByRatioVowel implements Comparator<Word> {

	@Override
	public int compare(Word arg0, Word arg1) {
		float wordOne = getRatioVowel(arg0.toString());
		float wordTwo = getRatioVowel(arg1.toString());

		return Float.compare(wordOne, wordTwo);
	}
	
	private float getRatioVowel(String word) {
		float vowel = 0; // гласная буква
		float consonant = 0; // согласная буква
// TODO сделать модификаторы шаблонов
		for (int i = 0; i < word.length(); i++) {
			String letter = Character.toString(word.charAt((i)));
			if (letter.toUpperCase().matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]")) {
				consonant++;
			} else if (letter.toUpperCase().matches("[АЕЁИОУЫЭЮЯ]")) {
				vowel++;
			} 
		}
		
		if (vowel > 0) {
			return consonant / vowel;
		} else {
			return -1;
		}
	}

}
