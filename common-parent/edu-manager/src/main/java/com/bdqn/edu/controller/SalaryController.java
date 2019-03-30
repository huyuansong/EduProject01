package com.bdqn.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController {


    @RequestMapping("manage")
    public String manage(){

        return "salary/manage";
    }

    @RequestMapping("edit")
    public String edit(){

        return "salary/edit";
    }

    @RequestMapping("info")
    public String info(){

        return  "salary/info";
    }

    @RequestMapping("update")
    public String update(){

        return  "salary/update";
    }

}
