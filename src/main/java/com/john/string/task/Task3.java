package com.john.string.task;

import com.john.string.extractor.TextExtractor;
import com.john.string.printer.TextPrinter;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
 */
public class Task3 implements Task {
    private TextPrinter textPrinter = new TextPrinter();
    private TextExtractor textExtractor = new TextExtractor();

    @Override
    public void run(Text text) {
        List<Word> result = new ArrayList<Word>();

        /**
         * Берем все предложения, первое из всех заносим в 'firstSentence'
         * Из общего массива всех предложений удаляем первое
         */
        List<Sentence> otherSentence = textExtractor.extractAllSentence(text);
        Sentence firstSentence = textExtractor.extractAllSentence(text).get(0);
        otherSentence.remove(0);

        List<Word> otherWordOfSentence = getAllWords(otherSentence);
        List<Word> firstWordOfSentence = getAllWords(firstSentence);

        for (Word word : firstWordOfSentence) {
            if (!isNoMatchesFound(word, otherWordOfSentence)) {
                result.add(word);
            }
        }
        textPrinter.printWords(result);
    }

    /**
     * Если слово не найдено в массиве слов, то FALSE
     */
    private boolean isNoMatchesFound(Word word, List<Word> otherWordOfSentence) {
        for (Word otherWord : otherWordOfSentence) {
            if (word.equals(otherWord)) {
                return true;
            }
        }
        return false;
    }


    private List<Word> getAllWords(List<Sentence> sentences) {
        List<Word> result = new ArrayList<Word>();
        for (Sentence sentence : sentences) {
            for (Token token : sentence) {
                if (token instanceof Word) {
                    result.add((Word) token);
                }
            }
        }
        return result;
    }

    private List<Word> getAllWords(Sentence sentence) {
        List<Word> result = new ArrayList<Word>();
        for (Token token : sentence) {
            if (token instanceof Word) {
                result.add((Word) token);
            }
        }
        return result;
    }
}
