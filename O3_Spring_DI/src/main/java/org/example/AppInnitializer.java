package org.example;


import org.example.config.AppConfig;
import org.example.di.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInnitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Boy boy = (Boy)context.getBean(Boy.class);
        boy.chatWithGirl();


        context.registerShutdownHook();

    }
}