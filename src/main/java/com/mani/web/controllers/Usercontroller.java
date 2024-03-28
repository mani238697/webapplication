package com.mani.web.controllers;


import com.mani.web.userspack.SaveUser;
import com.mani.web.userspack.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class Usercontroller {
        @Autowired
        private SaveUser saveUser;
        @GetMapping("/addUser")
        public String userpage(Model model){
            model.addAttribute("user",new User());
            System.out.println("this is get request");
            return "addUser";
        }



//    @GetMapping("/addUser")
//    public String sendForm(User user) {
//
//        System.out.println("this is get/request mapping/get request");
//        return "addUser";
//    }

//    @PostMapping("/addUser")
//    public String processForm(User user) {
//        System.out.println("this is post request");
//        return "showMessage";
//    }

        @PostMapping("/addUser")
        public String processForm(User user){
            System.out.println(user.getName() + "and occupation"+user.getoccupation());
            User User = new User();
            Boolean status = saveUser.addUser(User);
            if(status){
                user.setName(null);
                user.setOccupation(null);
                return "addUser";
            }
            System.out.println("this is post request");
            return "errormessage";
        }

    }

