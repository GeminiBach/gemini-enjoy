package com.gemini.enjoy.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caw on 2017/5/11.
 */

@RestController
public class MainCtrl {


    @RequestMapping("show")
    public Object show(){

        return 123;
    }

}
