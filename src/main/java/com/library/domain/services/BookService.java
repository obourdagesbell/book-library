package com.library.domain.services;

import com.library.domain.entities.Book;
import com.library.persistence.repositories.BookRepository;
import com.library.persistence.mappers.BookPersistenceMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .map(BookPersistenceMapper::mapToDomain)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book saveBook(Book book) {
        return BookPersistenceMapper.mapToDomain(
                bookRepository.save(BookPersistenceMapper.mapToPersistence(book))
        );
    }
}