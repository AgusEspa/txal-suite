package me.projects.texal;

import me.projects.texal.components.Paragraph;
import me.projects.texal.services.TextParserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TextParserServiceTest {

    @Test
    public void givenTextReturnParsedText() {

    String text = "In introductory textbooks, as well as elsewhere in the literature, whenever human natural language is discussed it is often contrasted with animal communication, implying that the particular author sees language as a more complex instrument for symbolic communication as compared with animal communication systems.\nThere is, however, an alternative construal of language that sees it as an instrument of thought. This is the view of the rationalist tradition, most notably as it is manifested in philosophy of language and in linguistics.\nI think this is the end.";

    List<Paragraph> paragraphs = TextParserService.parse(text);

    assertEquals(paragraphs.size(), 3);

    }
}
