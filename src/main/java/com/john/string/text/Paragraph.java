package com.john.string.text;

import java.util.Iterator;
import java.util.List;

public class Paragraph implements Iterable<Sentence> {
    private List<Sentence> sentences;

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public Iterator<Sentence> iterator() {
        return sentences.iterator();
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence;
        }
        return result;
    }
}
