package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Patron;
import com.example.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class DummyDataController {
    @Autowired
    private LibraryService libraryService;

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void removeBook(@PathVariable Long id) {
        libraryService.removeBook(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @PostMapping("/patrons")
    public Patron registerPatron(@RequestBody Patron patron) {
        return libraryService.registerPatron(patron);
    }

    @GetMapping("/patrons")
    public List<Patron> getAllPatrons() {
        return libraryService.getAllPatrons();
    }

    @GetMapping("/books/search/title")
    public List<Book> searchBooksByTitle(@RequestParam String title) {
        return libraryService.searchBooksByTitle(title);
    }

    @GetMapping("/books/search/author")
    public List<Book> searchBooksByAuthor(@RequestParam String author) {
        return libraryService.searchBooksByAuthor(author);
    }

    @GetMapping("/books/search/isbn")
    public Book searchBookByIsbn(@RequestParam String isbn) {
        return libraryService.searchBookByIsbn(isbn);
    }
}