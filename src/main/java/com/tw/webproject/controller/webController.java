package com.tw.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("in home");
        return "home.html";
    }

    @RequestMapping("/")
    public String index() {
        System.out.println("in index");
        return "index.jsp";
    }
}
