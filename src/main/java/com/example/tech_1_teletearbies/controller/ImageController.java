package com.example.tech_1_teletearbies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ImageController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }





}
