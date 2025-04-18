package com.library.persistence.mappers;

import com.library.domain.entities.Book;

public class BookPersistenceMapper {

    public static com.library.persistence.entities.Book mapToPersistence(Book book) {
        com.library.persistence.entities.Book persistenceBook = new com.library.persistence.entities.Book();
        persistenceBook.setTitle(book.getTitle());
        persistenceBook.setAuthor(book.getAuthor());
        return persistenceBook;
    }

    public static Book mapToDomain(com.library.persistence.entities.Book persistenceBook) {
        Book book = new Book();
        book.setTitle(persistenceBook.getTitle());
        book.setAuthor(persistenceBook.getAuthor());
        return book;
    }
}