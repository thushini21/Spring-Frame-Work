package org.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@Component

public class HelloController {
//    public HelloController(){
//        System.out.println("hello controller");
//    }
@GetMapping  // methndi ar uda tyena request mapping eke hello ek ghin bar ek uda ghuwam run krt psse meke sout ek print wel pennwan apita
    public String sayHello(){
     return "index";

     //methnt danne api hadfana file eke nama //
    }
}
