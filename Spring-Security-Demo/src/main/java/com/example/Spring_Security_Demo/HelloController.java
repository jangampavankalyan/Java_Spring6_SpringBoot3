package com.example.Spring_Security_Demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet(HttpServletRequest request){
        return "Hello Pavan Kalyan" + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request){
        return "Ghost" + request.getSession().getId();
    }
}
