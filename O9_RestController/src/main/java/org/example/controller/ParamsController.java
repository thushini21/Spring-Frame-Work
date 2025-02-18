package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping( "params")
public class ParamsController {
//    params?id=12
 /*   @GetMapping(path = "new" , params = {"id","name"})
    public String test1(@RequestParam("id") String id ,
                        @RequestParam("name") String name ){
        return id + " " + name;
    }*/
}
