package com.jokerkiki.demo.controller;

import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    public static void main(String[] args) {
        DemoController demoController = new DemoController();
        System.out.println(demoController.demo());
    }

    public String demo(){

        return demoService.toString();
    }
}
