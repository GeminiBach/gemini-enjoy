package com.gemini.scheduler.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexCtrl {


    @RequestMapping("")
    public String index(Model model, @RequestParam("hello") String hello){
        model.addAttribute("hello","Hello Word!");
        return "index";
    }

}
