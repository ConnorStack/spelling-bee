package com.personalproject.spellingbee.controller;
import com.personalproject.spellingbee.model.Word;
import com.personalproject.spellingbee.repository.WordRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class WordController {
    private final WordRepository wordRepository;

    @Autowired
    public WordController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping("/words")
    public Iterable<Word> getAllWords() {
        return wordRepository.findAll();
    }

    @PostMapping("/words")
    public Word addWord(@RequestBody Word word) {
        return wordRepository.save(word);
    }
}

