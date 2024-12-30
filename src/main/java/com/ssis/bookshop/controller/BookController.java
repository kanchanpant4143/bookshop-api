package com.ssis.bookshop.controller;

import com.ssis.bookshop.models.Book;
import com.ssis.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Mono<Book> addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Mono<Book> getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteBook(@PathVariable("id") Long id) {
        return bookService.deleteBook(id);
    }

    @PutMapping
    public Mono<Book> updateBook(@RequestBody Book updatedBook) {
        return bookService.updateBook(updatedBook);
    }


}
