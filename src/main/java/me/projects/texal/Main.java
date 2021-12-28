package me.projects.texal;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final String text = "In introductory textbooks, as well as elsewhere in the literature, whenever human natural language is discussed it is often contrasted with animal communication, implying that the particular author sees language as a more complex instrument for symbolic communication as compared with animal communication systems.\nThere is, however, an alternative construal of language that sees it as an instrument of thought. This is the view of the rationalist tradition, most notably as it is manifested in philosophy of language and in linguistics.\nI think this is the end.";
        final List<Paragraph> paragraphs = (List<Paragraph>)TextParser.parse(text);
        System.out.print(paragraphs.size());
    }
}
