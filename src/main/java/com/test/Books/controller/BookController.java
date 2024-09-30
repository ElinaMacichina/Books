package com.test.Books.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.Books.model.Book;
import com.test.Books.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {
    Book book;

    // @Autowired
    private BookService bookService;

    @GetMapping("{bookId}")
    public Book getBookDetails(String bookId){
        return book;
    }

    @PostMapping
    public String createBookDetails(@RequestBody Book book){
        this.book = book;
        return "Book Added Successfully";
    }

    @PutMapping
    public String updateBookDetails(@RequestBody Book book){
        this.book = book;
        return "Book Updated Successfully";
    }
    
    @DeleteMapping("{bookId}")
    public String deleteBookDetails(String bookId){
        this.book = null;
        return "Book Deleted Successfully";
    }

    @GetMapping
    public List<Book> getBooks(@RequestParam(required = false) String title,
                                @RequestParam(required = false) String author,
                                @RequestParam(required = false) Integer year,
                                @RequestParam(required = false) Double rating) {
        return bookService.filterBooks(title, author, year, rating);
    }

    @PostMapping("/{bookId}/rate")
    public String rateBook(@RequestBody Book book, @RequestParam int rating){
        this.book = bookService.rateBook(this.book.getId(), rating);
        return "Book Rated Successfully";
    }
}
