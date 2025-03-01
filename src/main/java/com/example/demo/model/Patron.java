package com.example.demo.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    private String name;
    private String patronId;

    @ManyToMany
    @JoinTable(
        name = "patron_books",
        joinColumns = @JoinColumn(name = "patron_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> borrowedBooks = new ArrayList<>();

    // Default constructor (required by JPA)
    public Patron() {}

    // Parameterized constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patronId='" + patronId + '\'' +
                ", borrowedBooks=" + borrowedBooks.size() +
                '}';
    }
}