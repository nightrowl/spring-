package com.jokerkiki.demo.controller;


import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;
}
