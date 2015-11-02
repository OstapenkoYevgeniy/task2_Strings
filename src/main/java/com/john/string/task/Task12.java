package com.john.string.task;

import com.john.string.extractor.TextExtractor;
import com.john.string.parse.exception.ParsingException;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by John on 01.11.2015.
 */
public class Task12 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();
    private int lengthMin;
    private int lengthMax;

    public Task12(int lengthMin, int lengthMax) {
        this.lengthMin = lengthMin;
        this.lengthMax = lengthMax;
    }

    @Override
    public void run(Text text) throws ParsingException {
        List<Paragraph> paragraphs = textExtractor.extractAllParagraph(text);

        for (Paragraph paragraph : paragraphs) {
            for (Sentence sentence : paragraph) {
                sentence = removeAllWordsGivenLength(sentence);
            }
        }

        textPrinter.print(text);
    }

    private Sentence removeAllWordsGivenLength(Sentence sentence) {
        Iterator<Token> it = sentence.iterator();
        while (it.hasNext()) {
            Token token = it.next();
            if (token instanceof Word) {
                String word = ((Word) token).getWord();
                if (Character.toString(word.charAt(0)).toUpperCase().matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩ]")) {
                    if (word.length() >= lengthMin && word.length() <= lengthMax) {
                        it.remove();
                    }
                }
            }
        }
        return sentence;
    }
}
