package com.john.string.task;

import com.john.string.comporators.SortByAlphabetically;
import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Text;
import com.john.string.text.token.Word;

import java.util.List;

/**
 * Напечатать слова текста в алфавитном порядке по первой букве.
 * Слова, начинающиеся с новой буквы, печатать с красной строки.
 */
public class Task6 implements Task {
    TextPrinter textPrinter = new TextPrinter();
    TextExtractor textExtractor = new TextExtractor();

    @Override
    public void run(Text text) {
        List<Word> result = textExtractor.extractAllWord(text);
        result.sort(new SortByAlphabetically());
        printAccordingToTask(result);
    }

    /**
     * Вывести на экран согласно условию задачи.
     */
    public void printAccordingToTask(List<Word> words) {
        char tmpLetter = ' ';
        for (Word word : words) {
            char firstLetter = word.toString().toLowerCase().charAt(0);
            // Если новая буква, то вывести с красной строки
            // Переменной 'tmpLetter' присвоить новую букву
            if (tmpLetter != firstLetter) {
                tmpLetter = firstLetter;
                System.out.println("  " + word);
            } else {
                System.out.println(word);
            }
        }
    }
}
