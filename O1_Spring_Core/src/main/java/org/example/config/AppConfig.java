package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // declarative programming
@ComponentScan(basePackageClasses = TestBean1.class)//mehemath class ek bean ekk kyl kynn plwn
@ComponentScan(basePackages = "org.example.bean")//bean pakage ee tyena clases okom bean kyl kiynwa
//@ComponentScan(basePackages ="org.example.bean" , "org.example.bean.f=dto" )//multiplr pkags tyenm mehem dnn plwn
public class AppConfig {

//     public AppConfig(){
//         System.out.println("AppConfig Constructor");
//     }

    //ape nowana class ekkin ibject ekk hdgnn plwn
//    @Bean
//    public MyConnection myConnection(){
//        return new MyConnection();
//    }

    @Bean// bean id ek change krnn plwn
    @Scope("prototype")
    public MyConnection getConnection(){

        return new MyConnection();
    }







}
