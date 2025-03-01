package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.Patron;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PatronRepository patronRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void removeBook(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Patron registerPatron(Patron patron) {
        return patronRepository.save(patron);
    }

    public List<Patron> getAllPatrons() {
        return patronRepository.findAll();
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return bookRepository.findByAuthorContainingIgnoreCase(author);
    }

    public Book searchBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
}