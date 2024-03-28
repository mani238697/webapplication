package com.mani.web.controllers;

import com.mani.web.dto.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MessageController {
    @Autowired
    @Qualifier("RupayCard")
    CreditCard creditCard;
//    @GetMapping("/message")
//    public String displaynames(Model model) {
//        model.addAttribute("message","this is mani");
//        creditCard.distributed();
//        return"hello";
//    }
    @GetMapping("/message")
    public String displaynames(Model model) {
        model.addAttribute("message","this is mani");
        creditCard.distributed();
        return"hello";
    }
    
    @RequestMapping
    public String test(Model model){
//        model.addAttribute("mani","tony stark");
//        model.addAttribute("message","just shut it down");
        model.addAttribute("login","mani@238");
        return "loginpage";
    }
//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    @ResponseBody
//    public String test1(){
//        return "loginpage";
//    }

    @GetMapping("/normal")
    public String normal(){
        System.out.println("normal statement");
        return "normal";
    }

}
