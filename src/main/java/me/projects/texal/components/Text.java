package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Text {

    private String title;

    private List<Paragraph> paragraphs;

    public Text() {}

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
}
