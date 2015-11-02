package com.john.string.extractor;

import java.util.ArrayList;
import java.util.List;

import com.john.string.text.Paragraph;
import com.john.string.text.Sentence;
import com.john.string.text.Text;
import com.john.string.text.token.Token;
import com.john.string.text.token.Word;

public class TextExtractor {

    public List<Paragraph> extractAllParagraph(Text text) {
        List<Paragraph> result = new ArrayList<Paragraph>();
        for (Paragraph paragraph : text) {
            result.add(paragraph);
        }
        return result;
    }

    public List<Sentence> extractAllSentence(Text text) {
        List<Sentence> resultList = new ArrayList<Sentence>();
        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                resultList.add(sentence);
            }
        }
        return resultList;
    }

    public List<Token> extractAllToken(Text text) {
        List<Token> resultList = new ArrayList<Token>();
        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                for (Token token : sentence) {
                    resultList.add(token);
                }
            }
        }
        return resultList;
    }

    public List<Word> extractAllWord(Text text) {
        List<Word> resultList = new ArrayList<Word>();
        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                for (Token token : sentence) {
                    if (token instanceof Word) {
                        resultList.add((Word) token);
                    }
                }
            }
        }
        return resultList;
    }

    public String extractAllText(Text text) {
        String result = "";

        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                for (Token token : sentence) {
                    result += token;
                }
                result += " ";
            }
            result = result.trim();
            result += "\n";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public List<Word> extractAllWordFromSentence(Sentence sentence) {
        List<Word> result = new ArrayList<Word>();
        for (Token token : sentence) {
            if (token instanceof Word) {
                result.add((Word) token);
            }
        }
        return result;
    }
}
