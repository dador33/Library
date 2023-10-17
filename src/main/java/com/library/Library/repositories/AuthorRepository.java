package com.library.Library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.Library.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
	

}
