package me.projects.texal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextParser {
    
    public static List<Paragraph> parse(final String text) {

        final String[] rawParagraphs = text.split("\\r\\n|\\n|\\r");

        return Arrays.stream(rawParagraphs)
                .map(p -> new Paragraph(p))
                .collect(Collectors.toList());
    }
}
