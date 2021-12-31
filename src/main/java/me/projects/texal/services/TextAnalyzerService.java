package me.projects.texal.services;

import me.projects.texal.components.Keyword;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;

import me.projects.texal.components.Text;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TextAnalyzerService {

    public static void analyse(Text text) {

        Tokenizer tokenizer = WhitespaceTokenizer.INSTANCE;

        text.getParagraphs().stream()
                .forEach(paragraph -> {
                    String[] tokens = tokenizer.tokenize(paragraph.getParagraph());
                    Arrays.stream(tokens)
                            .forEach(t -> paragraph.setKeywords(new Keyword(t)));
                });

    }

}
