package me.projects.texal.controllers;

import me.projects.texal.Paragraph;
import me.projects.texal.TextParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parse")
public class ParseController {

    @PostMapping
    public List<Paragraph> analyze(@RequestBody String text) {
        return TextParser.parse(text);
    }
}
