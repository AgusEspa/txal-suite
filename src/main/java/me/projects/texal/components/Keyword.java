package me.projects.texal.components;

import org.springframework.stereotype.Component;

@Component
public class Keyword {

    private String word;

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
}
