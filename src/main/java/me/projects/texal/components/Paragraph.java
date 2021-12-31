package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Paragraph {

    private String paragraph;
    private List<String> keyWords;

    public Paragraph() {
    }

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getParagraph() {
        return this.paragraph;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }
}
