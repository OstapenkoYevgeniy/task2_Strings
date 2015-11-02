package com.john.string.task;

import com.john.string.comporators.SortByNumberOfLetters;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.task.enums.SortDirection;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

import java.util.List;

/**
 * 9. Все слова текста рассортировать по возрастанию количества заданной буквы в слове.
 *  Слова с одинаковым коли¬чеством расположить в алфавитном порядке.
 * 13. Отсортировать слова в тексте по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */
public class Task9_13 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();

    private String letter;
    private SortDirection sortDirection;

    /**
     * @param letter - какую букву считать
     * @param sortDirection - направление сортировки
     */
    public Task9_13(String letter, SortDirection sortDirection) {
        this.letter = Character.toString(letter.charAt(0));
        this.sortDirection = sortDirection;
    }

    @Override
    public void run(Text text) {
        List<Word> words = textExtractor.extractAllWord(text);

        switch (sortDirection) {
            case INCREASE:
                words.sort(new SortByNumberOfLetters(letter).reversed());
                break;
            case DECREASE:
                words.sort(new SortByNumberOfLetters(letter));
                break;
        }

        textPrinter.printWords(words);
    }
}