package com.john.string.task;

import com.john.string.extractor.TextExtractor;
import com.john.string.parse.SimpleParser;
import com.john.string.parse.exception.ParsingException;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

import java.util.Iterator;

/**
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 * НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!! НЕ ГОТОВО!!!
 */
public class Task15 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();
    //TODO дописать интерфейс парсер
    private SimpleParser parser = new SimpleParser();

    @Override
    public void run(Text text) throws ParsingException {
        textPrinter.print(text);
        System.out.println("------------------");

        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                Iterator<Token> it = sentence.iterator();
                while (it.hasNext()) {
                    Token token = it.next();
                    if (token instanceof Word) {
                        token = processing((Word) token);
                    }
                }
            }
        }
        textPrinter.print(text);

    }

    private Word processing(Word word) {
        String strWord = word.getWord();
        String firstLetter = Character.toString(strWord.charAt(0));
        String latestLetter = Character.toString(strWord.charAt(strWord.length() - 1));

        return new Word(parser.letterToWord(strWord));
    }
}
