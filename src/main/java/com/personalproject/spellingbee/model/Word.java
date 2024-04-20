package com.personalproject.spellingbee.model;

public class Word {
    private Long wordId;
    private String correctWord;

    public Long getId() {
        return wordId;
    }

    public void setId(Long id) {
        wordId = id;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public void setCorrectWord(String correctWord) {
        this.correctWord = correctWord;
    }
}
