package org.example.config;

import org.example.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //application ekt awashya beans tik watenn oni tika
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {

    @Bean
    public MyConnection MyConnection(){
        return new MyConnection();
    }

    

}
