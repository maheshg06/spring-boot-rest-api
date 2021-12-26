package com.vir.controller;

import com.vir.model.Book;
import com.vir.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String getMessage(){
        return "Hello";
    }


    //get all books
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }

    @RequestMapping("/listBooks")
    public String listBooks(Model model){
        model.addAttribute("listBooks",this.bookService.getAllBooks());
        return "listBooks";
    }

    //get a single book
    @GetMapping("/books/{id}")
    public Optional<Book> getBookById(@PathVariable("id") int id){
        return this.bookService.getBookById(id);
    }

    //create a book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }

    //delete a book
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id){
        this.bookService.deleteBook(id);
    }

    //update a book
    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable("id") int id){
        return this.bookService.updateBook(id,book);
    }





}
