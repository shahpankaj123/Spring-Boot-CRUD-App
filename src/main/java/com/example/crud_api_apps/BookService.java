package com.example.crud_api_apps;

import java.util.List;

public interface BookService {

    String Createbook(Books book);
    List<Booksentity> Readbook();
    Boolean delbook(long id);

} 
    
