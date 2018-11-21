package com.doudou.hk.dream.controller;

import org.springframework.format.datetime.joda.DateTimeFormatterFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloController {

    private int count = 0;
    @RequestMapping("/")
    public String index(Model model)
    {
        count++;
        Date inTime = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        model.addAttribute("inTime", format1.format(inTime));
        model.addAttribute("count",count);
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model)
    {
        return "hello";
    }
}
