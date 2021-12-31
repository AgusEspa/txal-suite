package me.projects.texal;

import me.projects.texal.components.Text;
import me.projects.texal.services.TextAnalyzerService;
import me.projects.texal.services.TextParserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzeController {

    @PostMapping("/api/analyze")
    public Text parseAndAnalyze(@RequestBody String rawText) {

        Text text = new Text(TextParserService.parse(rawText));

        TextAnalyzerService.analyse(text);

        return text;

    }
}
