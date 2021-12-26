package com.vir.service;

import com.vir.model.Book;
import com.vir.dao.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {


    @Autowired
    BookRepo bookRepo;


    public List<Book> getAllBooks(){
        return (List<Book>) this.bookRepo.findAll();
    }

    public Optional<Book> getBookById(int id) {
            return this.bookRepo.findById(id);
    }

    public Book addBook(Book book) {
        return this.bookRepo.save(book);
    }

    public void deleteBook(int id) {
        this.bookRepo.deleteById(id);
    }

    public Book updateBook(int id,Book book) {
        book.setBookId(id);
        return this.bookRepo.save(book);
    }

}
