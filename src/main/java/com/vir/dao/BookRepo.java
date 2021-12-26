package com.vir.dao;

import com.vir.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book,Integer> {

}
