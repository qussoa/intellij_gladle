package com.biz.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String hello(Model model){

        model.addAttribute("name","이몽룡");

        return "hello";
    }
}
