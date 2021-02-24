package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;

public class Post {
    private String text;
    private LocalDate datePosted;

    public Post(String text, LocalDate datePosted) {
        this.text = text;
        this.datePosted = datePosted;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }
}
