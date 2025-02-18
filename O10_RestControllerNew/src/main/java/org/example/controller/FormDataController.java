package org.example.controller;

import org.example.dto.CustomerDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {
   @PostMapping
    public String test1(@RequestParam("id") String id){
        return id;
    }

    @PostMapping(path = "test2")
    public String test2(CustomerDto customerDto){
        return customerDto.toString();
    }

//    @PostMapping(path = "test2")
//    public String test2(CustomerDTO customerDTO){
//        return customerDTO.toString();
//    }
}
