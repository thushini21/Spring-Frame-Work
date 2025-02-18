package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Exact")
public class ExactMappingController {
    @GetMapping(path = "test1")
    public String Test1(){
        return "test 1 method invoked";

    }
}
