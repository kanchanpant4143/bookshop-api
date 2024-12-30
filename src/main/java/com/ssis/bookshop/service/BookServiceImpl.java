package com.ssis.bookshop.service;

import com.ssis.bookshop.models.Book;
import com.ssis.bookshop.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public Mono<Book> saveBook(Book book) {
        Mono<Book> saved = bookRepo.save(book);
        return saved;
    }

    @Override
    public Mono<Book> getBookById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Mono<Book> updateBook(Book book) {
        Mono<Book> updated = bookRepo.save(book);
        return updated;
    }

    @Override
    public Mono<Void> deleteBook(Long id) {
        return bookRepo.deleteById(id);
    }

    @Override
    public Flux<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Flux<Book> search(String query) {
        return null;
    }
}
