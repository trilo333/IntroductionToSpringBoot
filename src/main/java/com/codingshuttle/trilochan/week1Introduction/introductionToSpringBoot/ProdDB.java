package com.codingshuttle.trilochan.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",  havingValue ="production")
public class ProdDB implements  DB{
    public String getData(){
        return "This is prod data";
    }
}
