package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Girl1 implements Agreement{

    public Girl1(){
        System.out.println("Girl Constructor.....");

    }
    public void chat(){
        System.out.println("Girl Is Chatting.....");

    }
}
