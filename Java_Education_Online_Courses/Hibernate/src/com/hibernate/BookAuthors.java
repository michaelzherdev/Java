package com.hibernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import tables.Author;
import tables.Book;

@Entity 
@Table(appliesTo = "book")
public class BookAuthors {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@JoinColumn(name="book_id", referencedColumnName="id")
	private Book book;
	
	@JoinColumn(name="author_id", referencedColumnName="id")
	private Author author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
