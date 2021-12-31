package me.projects.texal.components;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Paragraph {
	
    final private String paragraph;
    private List<String> keyWords;
    
    public Paragraph(String text) {
        this.paragraph = text;
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
