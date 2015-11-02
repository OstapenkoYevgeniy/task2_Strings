package com.john.string.comporators;

import com.john.string.text.token.Word;

import java.util.Comparator;

public class SortByFirstConsonant implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        char wordOne = getFirstConsonant(o1);
        char wordTwo = getFirstConsonant(o2);
        return Character.compare(wordOne, wordTwo);
    }

    /**
     * Получить первую глассную букву.
     */
    private char getFirstConsonant(Word word) {
        String strWord = word.getWord();
        for (int i = 0; i < strWord.length(); i++) {
            String letter = Character.toString(strWord.charAt(i));
            if (letter.toUpperCase().matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]")) {
                return letter.charAt(0);
            }
        }
        return ' ';
    }
}
