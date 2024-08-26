package com.codingshuttle.trilochan.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    void eatApple(){
            System.out.println("I am eating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying apple bean");
    }
}
