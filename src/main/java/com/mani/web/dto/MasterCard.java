package com.mani.web.dto;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("MasterCard")

public class MasterCard implements CreditCard {

    public MasterCard() {
        System.out.println("we are in default constructor");
    }
    @Override
    public void distributed() {
        System.out.println("We are in MasterCard");
    }
    @PostConstruct
    public void init(){
        System.out.println("we are postcontructor");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("we are in destroyconstructor");
    }


}
