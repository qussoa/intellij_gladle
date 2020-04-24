package com.biz.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String hello(){

        return "라sksk";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){

       model.addAttribute("name","홍길동");
        return "hello";
    }
}
