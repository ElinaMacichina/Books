package com.test.Books.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByYear(int year);
    List<Book> findByRating(double rating);
}
