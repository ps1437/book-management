package com.syscho.spring.bookmanagement;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.syscho.spring.bookmanagement.modal.Author;
import com.syscho.spring.bookmanagement.modal.Book;
import com.syscho.spring.bookmanagement.repository.BookRepository;

@Component
public class DataLoader implements CommandLineRunner {

	String bookName[] = { "Anna Karenina", "Madame Bovary", "War and Peace", "The Great Gatsby", "Middlemarch" };
	String authorName[] = { "Leo Tolstoy", "Gustave Flaubert", "Leo Tolstoy", "F. Scott Fitzgerald",
			"Vladimir Nabokov" };
	String bookGerne[] = { "Horror", "Comedy", "Rommance", "Moddy", "Action" };
	BookRepository respo;

	public DataLoader(BookRepository respo) {
		super();
		this.respo = respo;
	}

	@Override
	public void run(String... args) throws Exception {

		for (int i = 0; i <5 ; i++) {

			Author author = new Author();
			author.setAuthorName(authorName[i]);

			Set<Author> authorSet = new HashSet<>();
			authorSet.add(author);
			Book book = new Book();
			book.setBookGerne(bookGerne[i]);
			book.setBookName(bookName[i]);
			book.setBookPublishYear(i + 2000);
			book.setAuthor(authorSet);
			respo.save(book);
			System.out.println((i+1) + " Row Inserted.");
		}

	}

}
