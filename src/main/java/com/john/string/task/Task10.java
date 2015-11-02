package com.john.string.task;

import com.john.string.extractor.TextExtractor;
import com.john.string.parse.SimpleParser;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Существует текст и список слов. Для каждого слова из заданного списка найти,
 * сколько раз оно встречается в каждом предложении, и рассортировать слова по убыванию общего количества вхождений.
 */
public class Task10 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();
    private SimpleParser simpleParser = new SimpleParser();
    private List<String> strings; // слова которые должны совпасть

    public Task10(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run(Text text) {
        List<WordForSort> wordForSorts = new ArrayList<WordForSort>();

        for (String string : strings) {
            wordForSorts.add(new WordForSort(string, numberMatches(text, string)));
        }

        wordForSorts.sort(new SortByNumberMatches().reversed());

        List<Word> words = wordForSortToWord(wordForSorts);

        textPrinter.printWords(words);
    }

    /**
     * Конвертировать объект WordForSort в объект Word
     */
    private List<Word> wordForSortToWord(List<WordForSort> wordForSorts) {
        List<Word> result = new ArrayList<Word>();
        for (WordForSort wordForSort : wordForSorts) {
            result.add(new Word(simpleParser.letterToWord(wordForSort.word)));
        }
        return result;
    }

    /**
     * Количество совпадений слова в тектсе
     */
    private Integer numberMatches(Text text, String checkWord) {
        List<Word> words = textExtractor.extractAllWord(text);
        int counter = 0;
        for (Word word : words) {
            if (word.getWord().equalsIgnoreCase(checkWord)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Класс для хранения слова и количества его совпадений в слове
     */
    private class WordForSort {
        public String word;
        public Integer numberMatches;

        public WordForSort(String word, Integer numberMatches) {
            this.word = word;
            this.numberMatches = numberMatches;
        }
    }

    private class SortByNumberMatches implements Comparator<WordForSort> {
        @Override
        public int compare(WordForSort wordOne, WordForSort wordTwo) {
            return wordOne.numberMatches.compareTo(wordTwo.numberMatches);
        }
    }
}
