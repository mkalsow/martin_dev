package com.martin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
         
        String str = "Hello World!";
        mav.addObject("message", str);
 
        return mav;
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        String str = "Hello World!";
        mav.addObject("message", str);

        return mav;
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public ModelAndView index2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index_test");

        String str = "Hello World!";
        mav.addObject("message", str);

        return mav;
    }


    //hübsch machen mit meinen Sachen!!
    //reponsive machen
    //sass
    //susy grid
 
}