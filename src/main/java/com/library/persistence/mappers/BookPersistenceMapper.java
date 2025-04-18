package com.library.persistence.mappers;

import com.library.domain.entities.Book;
import com.library.persistence.entities.BookEntity;

public class BookPersistenceMapper {

    public static BookEntity mapToPersistence(Book book) {
        return new BookEntity(book.getId(), book.getTitle(), book.getAuthor());
    }

    public static Book mapToDomain(BookEntity persistenceBook) {
        return new Book(persistenceBook.getId(), persistenceBook.getTitle(), persistenceBook.getAuthor());
    }
}