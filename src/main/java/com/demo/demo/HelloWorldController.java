package com.demo.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
   // This method GET HTTP method
    //Access via localhost http:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world i am the method";
    }

}
