package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("WildCard")
public class WildCardMappingController {
   @GetMapping(path = "test1/*/hello")
    public String test1(){
        return "test 2 method invoked";

    }
//* lagata apita kthi value ekk dnn plwn
    //wildcard dekk dmmoth
}
