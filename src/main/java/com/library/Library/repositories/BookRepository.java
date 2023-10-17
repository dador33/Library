package com.library.Library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.Library.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
