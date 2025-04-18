package com.library.api.controllers;

import com.library.api.mappers.BookMapper;
import com.library.api.models.BookViewModel;
import com.library.domain.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public BookViewModel getBookById(@PathVariable Long id) {
        return BookMapper.mapToViewModel(bookService.getBookById(id));
    }

    @PostMapping
    public BookViewModel createBook(@RequestBody BookViewModel bookViewModel) {
        return BookMapper.mapToViewModel(
                bookService.saveBook(BookMapper.mapToDomain(bookViewModel))
        );
    }
}