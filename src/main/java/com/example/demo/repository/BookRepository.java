package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; // Add this import

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title); // Fix: Add List import
    List<Book> findByAuthorContainingIgnoreCase(String author); // Fix: Add List import
    Book findByIsbn(String isbn);
}