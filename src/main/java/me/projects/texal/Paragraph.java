package me.projects.texal;

import java.util.List;

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
