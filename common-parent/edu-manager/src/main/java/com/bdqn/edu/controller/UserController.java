package com.bdqn.edu.controller;

import com.bdqn.edu.model.User;
import com.bdqn.edu.service.userservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.BeansDtdResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(String name,String password){
        User user = userService.findById(1);
        return "Default";
    }

    @RequestMapping("manage")
    public String manage(){

        return "user/manage";
    }

    @RequestMapping("edit")
    public String edit(){

        return "user/edit";
    }

    @RequestMapping("info")
    public String info(){

        return  "user/info";
    }

    @RequestMapping("update")
    public String update(){

        return  "user/update";
    }



}
