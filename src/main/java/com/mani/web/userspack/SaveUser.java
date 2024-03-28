package com.mani.web.userspack;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component

    public class SaveUser {
        ArrayList<User> arrayList=new ArrayList<>();
        public Boolean addUser(User user){
            System.out.println("save method execution started");
            if((user.getoccupation()!=null) && (user.getname()!=null) && (user.getname()!="")){
                User User = new User();
                arrayList.add(User);
                return true;

            }
            return false;
        }
    }

