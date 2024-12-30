package com.ssis.bookshop.service;

import com.ssis.bookshop.models.Book;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    public Mono<Book> saveBook(Book book);

    public Mono<Book> getBookById(Long id);

    public Mono<Book> updateBook(Book book);

    public Mono<Void> deleteBook(Long id);

    public Flux<Book> getAllBooks();

    public Flux<Book> search(String query);

}
