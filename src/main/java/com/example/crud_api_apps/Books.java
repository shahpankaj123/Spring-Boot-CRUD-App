package com.example.crud_api_apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private long id;
    private String name;
    private String category;
    private String price;  
}
