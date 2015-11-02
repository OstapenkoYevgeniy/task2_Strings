package com.john.string.task;

import com.john.string.extractor.TextExtractor;
import com.john.string.parse.SimpleParser;
import com.john.string.parse.exception.ParsingException;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;

import java.util.List;

/**
 * В каждом предложении текста исключить подстроку максимальной длины,
 * начинающуюся и заканчивающуюся заданными символами.
 */
public class Task11 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();
    private SimpleParser simpleParser = new SimpleParser();
    private String letter; // Буква для поиска подстроки

    public Task11(String letter) { // здесь конструктор который устанавливает эту букву по которой мы будем искать
        this.letter = Character.toString(letter.charAt(0));
    }

    @Override
    public void run(Text text) throws ParsingException {
        List<Sentence> sentences = textExtractor.extractAllSentence(text);

        for (Sentence sentence : sentences) {
            sentence = removeSubstring(sentence);
        }

        textPrinter.print(sentences);
    }

    /**
     * Удаление максимально подстроки в предложении
     */
    private Sentence removeSubstring(Sentence sentence) throws ParsingException {
        String result = sentence.toString();
        int indexOf = result.toLowerCase().indexOf(letter.toLowerCase());
        int lastIndexOf = result.toLowerCase().lastIndexOf(letter.toLowerCase());

        if (indexOf != -1 && lastIndexOf != -1) {
            result = result.substring(0, indexOf) + result.substring(lastIndexOf + 1, result.length());
        }
        return simpleParser.SentenceToToken(result);
    }
}
