package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMapppingController {
    @GetMapping(path = "test1/I???")
    public String test1(){
        return "test1 get method invoked";
    }
}
