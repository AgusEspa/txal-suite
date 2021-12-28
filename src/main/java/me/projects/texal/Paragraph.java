package me.projects.texal;

import java.util.List;

public class Paragraph {
	
    private String paragraph;
    private List<String> keyWords;
    
    public Paragraph(final String text) {
        this.paragraph = text;
    }
    
    public String getParagraph() {
        return this.paragraph;
    }
}