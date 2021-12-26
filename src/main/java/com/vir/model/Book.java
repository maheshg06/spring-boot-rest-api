package com.vir.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

    public Book(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String bookDescription;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Book(int bookId, String bookName, String bookDescription) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
