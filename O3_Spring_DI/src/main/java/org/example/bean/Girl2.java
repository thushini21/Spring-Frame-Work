package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary  // meken thama kiynne mon class eke method ekt call krnne oni kiyla
@Component
public class Girl2 implements Agreement{
    @Override
    public void chat(){
        System.out.println("girl2 chat");
    }



}

