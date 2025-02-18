package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.example.bean","org.example.controller"})
public class WebAppConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".html");
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/views/**").addResourceLocations("WEB-INF/views/");
    }

    //cross mappind ek ek pr full project ektm dgnne


//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/*") // meth awashya eke path ek denn oni customernm ek nthnm wena ekk
//                .allowedOrigins("*") // port ek dnwa localhost:4200/http/localhost"4200 / http://example.com//
//                .allowCredentials(true)
//                .allowedMethods("GET","PUT","DELETE","OPTIONS")// awsya metid ek dnn oni
//                .allowedHeaders("*");
//    }
}
