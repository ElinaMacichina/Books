package com.test.Books.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;


@Entity
public class Book {

    // @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    // @Column
    private String title;
    // @Column
    private String author;
    // @Column
    private int year;
    //  @Column
    private double rating;

    @ElementCollection
    private List<Integer> ratings = new ArrayList<>();
    
    public Book() {}

    public Book(Long bookId, String title, String author, int year){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0;
    }

    public Long getId(){
        return bookId;
    }

    public void setId(Long bookId){
        this.bookId = bookId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getRating(){
        return rating;
    }
    
    public List<Integer> getRatings(){
        return ratings;
    }

    public void setRatings(List<Integer> ratings){
        this.ratings = ratings;
    }

    public void addRating(int rating) {
        this.ratings.add(rating);

        int sum = 0;
        int counter = 0;

        for (int rate : this.ratings){
            sum += rate;
            counter++;
        }

        if(counter != 0){
            this.rating = sum / counter;
        }
    }

}

