package com.example.crud_api_apps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    
    private BookService bookService;

    @Autowired
    public Controller(BookService bookService){
        this.bookService=bookService;
    }

    @GetMapping("api/get-book")
    public List<Books> getallbook() {
        return bookService.Readbook();
    }

    @PostMapping("api/create-book")
    public String createbook(@RequestBody Books book){
        bookService.Createbook(book);
        return "Book add Sucessfully";
    }  

    @DeleteMapping("api/del")
    public String deletebook(@RequestBody long id){

        if(bookService.delbook(id))
           return "Deleted";
        else
          return "Error";   
    }
}
