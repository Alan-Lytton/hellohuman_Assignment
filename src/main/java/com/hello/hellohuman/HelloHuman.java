package com.hello.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HelloHuman {

    public static void main(String[] args) {
        SpringApplication.run(HelloHuman.class, args);
    }

    @RequestMapping("/")
    public String hello(@RequestParam(value="name",required = false) String firstName,@RequestParam(value="last_name",required = false) String lastName){
        String response = String.format("Hello %s %s",firstName,lastName);
        if(firstName == null || lastName == null){
            response = "Hello Human";
        }
        return response;
    }
}
