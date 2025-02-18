package org.example.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("bean")
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Consrtuctor");
    }

    public void sayHello() {
        System.out.println("Hello Spring Bean");

    }
}
