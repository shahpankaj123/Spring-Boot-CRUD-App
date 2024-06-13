package com.example.crud_api_apps;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("api/get-book")
    public List<Books> getallbook() {

        List<Books> books = new ArrayList<>();
        Books b=new Books();
        b.setName("Python ML");
        books.add(b);
        return books;

    }
    
}
