package me.projects.texal;

import java.util.ArrayList;
import java.util.List;

public class TextParser {
    
    public static List<Paragraph> parse(final String text) {
        final List<Paragraph> paragraphs = new ArrayList<Paragraph>();
        final String[] split;
        final String[] rawParagraphs = split = text.split("\\r\\n|\\n|\\r");
        for (final String p : split) {
            paragraphs.add(new Paragraph(p));
        }
        return paragraphs;
    }
}
