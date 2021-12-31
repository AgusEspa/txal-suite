package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Paragraph {

    private String paragraph;

    private Set<Keyword> keywords;

    public Paragraph() {
    }

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
        this.keywords = new HashSet();
    }

    public String getParagraph() {
        return this.paragraph;
    }

}
