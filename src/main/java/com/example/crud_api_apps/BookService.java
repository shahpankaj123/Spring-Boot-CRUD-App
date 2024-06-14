package com.example.crud_api_apps;

import java.util.List;

public interface BookService {

    String Createbook(Books book);
    List<Books> Readbook();
    Boolean delbook(long id);

} 
    
