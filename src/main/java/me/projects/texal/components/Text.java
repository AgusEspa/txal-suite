package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Text {

    private List<Paragraph> paragraphs;

    public Text() {}

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
}
