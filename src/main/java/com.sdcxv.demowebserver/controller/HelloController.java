package com.sdcxv.demowebserver.controller;

/**
 * Created by sdcxv on 2016/11/7.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sdcxv on 2016/3/2.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/mvc")
    public String helloMvc() {
        return "../index.jsp";
    }
}

