package com.library.api.controllers;

import com.library.api.mappers.BookMapper;
import com.library.api.models.BookViewModel;
import com.library.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public BookViewModel getBookById(@PathVariable Long id) {
        return BookMapper.mapToViewModel(bookService.getBookById(id));
    }

    @GetMapping("/author/{author}")
    public List<BookViewModel> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooks(author)
                .stream()
                .map(BookMapper::mapToViewModel)
                .collect(Collectors.toList());
    }

    @PostMapping
    public BookViewModel createBook(@RequestBody BookViewModel bookViewModel) {
        return BookMapper.mapToViewModel(
                bookService.saveBook(BookMapper.mapToDomain(bookViewModel))
        );
    }
}