package org.example.controller;

import org.example.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDto customerDTO){
        return customerDTO.toString();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto test2() {
        return new CustomerDto("Thushini", "Akashi", 21);
    }


    @GetMapping(path = "getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDto> test3() {
        ArrayList<CustomerDto> list = new ArrayList<>();
        list.add(new CustomerDto("Thushini", "Akashi", 21));
        list.add(new CustomerDto("Thushini", "Akashi", 32));
        list.add(new CustomerDto("Thushini", "Akashi", 40));
    return list;
    }
}
