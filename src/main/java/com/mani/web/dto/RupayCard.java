package com.mani.web.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("RupayCard")

public class RupayCard implements CreditCard{
    @Override
    public void distributed() {
        System.out.println("We are in RupayCard");
    }
}
