package com.gemini.webapi.controller;

import com.gemini.scheduler.service.ScheduleService;
import com.gemini.crawler.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class JoinController {

    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private CrawlerService crawlerService;

    @RequestMapping("")
    public String index(Model model, @RequestParam("hello") String hello){

        scheduleService.loadSchecule();
        crawlerService.loadCrawler();
        model.addAttribute("hello","Hello ervice!");
        return "index";
    }

}
