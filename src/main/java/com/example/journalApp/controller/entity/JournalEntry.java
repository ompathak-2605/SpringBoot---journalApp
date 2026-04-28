package com.example.journalApp.controller.entity;

public class JournalEntry {
    private long id;          // line 4
    private String title;    // line 5
    private String content;  // line 6

    // Constructor
    public JournalEntry(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}