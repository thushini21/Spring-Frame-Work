package org.example.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //  api loyn class eke object ekk hdgnn nisa
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//scope ek anuwa wnw wnw
public class TestBean1 {

}
