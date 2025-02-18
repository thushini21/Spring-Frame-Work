package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBean implements BeanNameAware , BeanFactoryAware , ApplicationContextAware,InitializingBean,DisposableBean {
    public SpringBean(){
        System.out.println("spring bean constructor");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFacoryAware setBeanFactory");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContexAware setApplicationContex");

    }
}
