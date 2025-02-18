package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
//@ImportResource("class path : abc.xml") // root ekenm tynne mehem denn plwn
//@ImportResource("file.")

@Import({AppConfig1.class})
public class AppConfig {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }


    }