package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${USERNAME}")
    private String logName;

    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;
    public SpringBean(){
        System.out.println("Spring Bean Consrtuctor");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("osName:"+ osName);
        System.out.println("USERNAME:"+ logName);
        System.out.println("db.user:"+ dbUser);
        System.out.println("db.password:"+ dbPassword);

    }
}
