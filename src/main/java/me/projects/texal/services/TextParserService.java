package me.projects.texal.services;

import me.projects.texal.components.Paragraph;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextParserService {
    
    public static List<Paragraph> parse(final String text) {

        final String[] rawParagraphs = text.split("\\r\\n|\\n|\\r");

        return Arrays.stream(rawParagraphs)
                .map(p -> new Paragraph(p))
                .collect(Collectors.toList());
    }
}
