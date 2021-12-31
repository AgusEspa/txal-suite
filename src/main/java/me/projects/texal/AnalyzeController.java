package me.projects.texal;

import me.projects.texal.components.Text;
import me.projects.texal.services.TextParserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analyze")
public class AnalyzeController {

    @PostMapping
    public Text parseAndAnalyze(@RequestBody String rawText) {

        Text text = new Text(TextParserService.parse(rawText));

        return text;

    }
}
