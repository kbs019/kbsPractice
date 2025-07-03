package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParamController {
    
    @GetMapping("ex012")
    public String ex012(){
        return "ex012";
    }
}
