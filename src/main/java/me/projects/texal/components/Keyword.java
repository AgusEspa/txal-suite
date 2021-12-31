package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Keyword {

    private String word;

    private int relevance;

    public Keyword() {
    }

    public Keyword(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyword keyword = (Keyword) o;
        return Objects.equals(word, keyword.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
