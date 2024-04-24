package com.personalproject.spellingbee.controller;
import com.personalproject.spellingbee.model.Word;
import com.personalproject.spellingbee.repository.WordRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!!!";
    }

    @GetMapping("/text")
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok().body("Plain text response");
    }

    @PostMapping("/words")
    public Word addWord(@RequestBody Word word) {
        return wordRepository.save(word);
    }

//    @GetMapping("/")
//    public String showForm(Model model) {
//        return "wordForm";  // This will render the Thymeleaf template at src/main/resources/templates/wordForm.html
//    }
}

