package com.johndnovosel.maven.book_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book book() {
        return new Book(1, "Book Name", "John Doe", false);
    }
}