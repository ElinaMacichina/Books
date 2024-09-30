package com.test.Books.service;

import java.util.List;

import com.test.Books.model.Book;
import com.test.Books.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    public List<Book> filterBooks(String title, String author, Integer year, Double rating) {
        if (title != null && !title.isEmpty()) {
            return bookRepo.findByTitle(title);
        } else if (author != null && !author.isEmpty()) {
            return bookRepo.findByAuthor(author);
        } else if (year != null) {
            return bookRepo.findByYear(year);
        } else if (rating != null) {
            return bookRepo.findByRating(rating);
        }
        return bookRepo.findAll();
    }

    public Book rateBook(Long bookId, int rating) {
        Book book = bookRepo.findById(bookId).orElseThrow();
        book.addRating(rating);
    
        return bookRepo.save(book);
    }
}
