package com.john.string.comporators;

import com.john.string.text.token.Word;

import java.util.Comparator;

public class SortByNumberOfLetters implements Comparator<Word>{
    private String searchForLetter;

    public SortByNumberOfLetters(String searchForLetter) {
        this.searchForLetter = searchForLetter;
    }

    @Override
    public int compare(Word wordOne, Word wordTwo) {
        int numberLetterOne = getNumberLetter(wordOne, searchForLetter);
        int numberLetterTwo = getNumberLetter(wordTwo, searchForLetter);

        if (numberLetterOne < numberLetterTwo) {
            return 1;
        } else if (numberLetterOne > numberLetterTwo) {
            return -1;
        } else {
            return Character.compare(wordOne.getWord().charAt(0),wordTwo.getWord().charAt(0));
        }

    }

    private Integer getNumberLetter(Word word, String letter) {
        String strWord = word.getWord();
        int counter = 0;
        String wordLetter;
        for (int count = 0; count < strWord.length(); count++)  {
            wordLetter = Character.toString(strWord.charAt(count));
            if (wordLetter.compareToIgnoreCase(letter) == 0) {
                counter++;
            }
        }
        return counter;
    }
}

