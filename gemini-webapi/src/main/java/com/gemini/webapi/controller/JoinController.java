package com.gemini.webapi.controller;

//import com.gemini.scheduler.service.ScheduleService;
//import com.gemini.crawler.service.CrawlerService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JoinController {

//    @Autowired
//    private ScheduleService scheduleService;
//    @Autowired
//    private CrawlerService crawlerService;

    @RequestMapping("")
    public ModelAndView index(){

//        scheduleService.loadSchecule();
//        crawlerService.loadCrawler();

        //return "index";
        return new ModelAndView("redirect:/join/index.html");
    }

}
