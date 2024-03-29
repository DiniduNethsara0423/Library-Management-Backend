package org.example.service;

import org.example.dto.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAllBooks();
    void deleteBook(Long id);
}
