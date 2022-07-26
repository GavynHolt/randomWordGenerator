package com.gavynholt.randomwordgenerator.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class WordsRestController {

    @GetMapping("word")
    public String getRandomWord() {
        return "random word to be returned here...";
    }
}
