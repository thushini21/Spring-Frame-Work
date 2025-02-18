package org.example.config;

import org.example.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration

public class AppConfig1 {

    @Bean
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }

}
