package com.example.tmacdemo.service;

import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    public void getExample() throws Exception {
        System.out.println("I get a example!");
        
        
        
        int j=0;
        for(int i=0;i<10;i++){
            j++;
        }
        for(int i=0;i<10;i++){
            j++;
        }
    }
}
