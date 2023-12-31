package com.library.Library.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.library.Library.domain.Author;
import com.library.Library.domain.Book;
import com.library.Library.domain.Publisher;
import com.library.Library.repositories.AuthorRepository;
import com.library.Library.repositories.BookRepository;
import com.library.Library.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner  {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		Publisher publisher= new Publisher("Penguing house","ricaurte","bucara","san","56a");
		publisherRepository.save(publisher);	
		
		
		Author eric = new Author("Eric","Evans");
		Book ddd= new Book("Domain Driven Desing","785236");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		 
	    ddd.setPublisher(publisher);
	    publisher.getBooks().add(ddd);
	
		 
		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		 
	    Author rod = new Author("Rod","Jhonson");
	    Book  noEJB= new Book("J2eee","3636985");
	    rod.getBooks().add(noEJB);
	    noEJB.getAuthors().add(rod);
	
	    noEJB.setPublisher(publisher);
	    publisher.getBooks().add(noEJB);
	    
	    authorRepository.save(rod);
	    bookRepository.save(noEJB);
	    publisherRepository.save(publisher);
	     
	    System.out.println("Started in bootStrap");
	    System.out.println("Numbers of books "+bookRepository.count());
	
	    System.out.println("Numbers of publisher "+publisherRepository.count());
	    
	    System.out.println("Numbers of books "+publisher.getBooks().size());

     
		
	}
	
	

}
