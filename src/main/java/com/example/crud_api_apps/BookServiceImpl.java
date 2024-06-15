package com.example.crud_api_apps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;
    
    List<Books> books=new ArrayList<>();

    @Override
    public String Createbook(Books book) {
        Booksentity booksentity =new Booksentity();
        BeanUtils.copyProperties(book, booksentity);
        bookRepository.save(booksentity);
        //books.add(book);
        return "Book Added Successfully";
    }

    @Override
    public List<Booksentity> Readbook() {
        List<Booksentity> booklist= bookRepository.findAll();
        return booklist;
    }

    @Override
    public Boolean delbook(long id) {
        Booksentity b=bookRepository.findById(id).get();
        bookRepository.delete(b);
        return true;
    }   
}
