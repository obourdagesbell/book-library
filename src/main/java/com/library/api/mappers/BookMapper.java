package com.library.api.mappers;

import com.library.api.models.BookViewModel;
import com.library.domain.entities.Book;

public class BookMapper {

    public static BookViewModel mapToViewModel(Book book) {
        return new BookViewModel(book.getId(), book.getTitle(), book.getAuthor());
    }

    public static Book mapToDomain(BookViewModel bookViewModel) {
        return new Book(bookViewModel.getId(), bookViewModel.getTitle(), bookViewModel.getAuthor());
    }
}