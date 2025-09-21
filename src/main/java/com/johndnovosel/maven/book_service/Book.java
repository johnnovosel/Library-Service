package com.johndnovosel.maven.book_service;

public record Book(long id, String title, String author, boolean isLoaned) {  }