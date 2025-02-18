package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements di {
//    @Autowired
    Agreement girl;

    public void chatWithGirl(){
        girl.chat();
    }



}
