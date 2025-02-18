package org.example;

import org.example.config.WebAppConfig;
import org.example.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAppInnitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};//handpu class ek link kr {WebRootConfig.class}
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebAppConfig.class};//anik class ek dgtta
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}