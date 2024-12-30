package com.ssis.bookshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("book_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @Column("book_id")
    private Long bookId;
    @Column("title")
    private String title;
    @Column("author")
    private String author;
    @Column("description")
    private String description;
    @Column("publisher")
    private String publisher;

}
