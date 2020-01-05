package com.syscho.spring.bookmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.syscho.spring.bookmanagement.modal.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
