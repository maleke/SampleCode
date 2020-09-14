package com.example.book.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Long id;
    private String author;
    private String title;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.author = author;
        this.title = title;
    }
}
