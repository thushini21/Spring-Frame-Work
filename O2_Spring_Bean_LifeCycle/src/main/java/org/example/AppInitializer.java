package org.example;

import org.example.bean.TestBean1;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        TestBean1 ref1= context.getBean(TestBean1.class);
        System.out.println(ref1);

        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        context.registerShutdownHook();

    }
}