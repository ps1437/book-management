package com.syscho.spring.bookmanagement.modal;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BOOK_ID")
	private Long bookId;
	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "BOOK_GERNE")
	private String bookGerne;
	@Column(name = "BOOK_PUBLISH_YEAR")
	private int bookPublishYear;

	@ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
	private Set<Author> author;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookGerne() {
		return bookGerne;
	}

	public void setBookGerne(String bookGerne) {
		this.bookGerne = bookGerne;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	public int getBookPublishYear() {
		return bookPublishYear;
	}

	public void setBookPublishYear(int bookPublishYear) {
		this.bookPublishYear = bookPublishYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}

}