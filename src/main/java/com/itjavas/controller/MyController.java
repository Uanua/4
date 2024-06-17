package com.itjavas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class MyController {
    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello...first");
        return "success";
    }
    @RequestMapping("/param1")
    public String param1(String username,Integer age){
        System.out.println("username:"+username+"age:"+age);
        return  "success";
    }
    @RequestMapping(value = "/rest",method = RequestMethod.POST)
    public String post(String restusername, Integer restage) {
        System.out.println("你提交的是restname: " + restusername + " - restage: " + restage);
        if ("1677555".equals(restusername) && restage == 114514) {
            return "success";
        } else {
            return "error";
        }
    }
    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    public String get(String restusername, Integer restage) {
        System.out.println("你提交的是restname: " + restusername + " - restage: " + restage);
        if ("1677555".equals(restusername) && restage == 114514) {
            return "success";
        } else {
            return "error";
        }
    }

}
