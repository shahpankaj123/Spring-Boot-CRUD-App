package com.example.crud_api_apps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    
    List<Books> books=new ArrayList<>();

    @Override
    public String Createbook(Books book) {
        books.add(book);
        return "Book Added Successfully";
    }

    @Override
    public List<Books> Readbook() {
        return books;
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    public Boolean delbook(long id) {
        books.remove(id);
        return true;
    }   
}
