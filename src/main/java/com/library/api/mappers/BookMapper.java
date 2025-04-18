package com.library.api.mappers;

import com.library.api.models.BookViewModel;
import com.library.domain.entities.Book;

public class BookMapper {

    public static BookViewModel mapToViewModel(Book book) {
        return new BookViewModel(book.getTitle(), book.getAuthor());
    }

    public static Book mapToDomain(BookViewModel bookViewModel) {
        Book book = new Book();
        book.setTitle(bookViewModel.getTitle());
        book.setAuthor(bookViewModel.getAuthor());
        return book;
    }
}