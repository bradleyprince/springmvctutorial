package com.springmvctutorial.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController{
   
   @GetMapping("/index")
   public ModelAndView home(final ModelMap model){
      System.out.println("index");
      return new ModelAndView("index", model);
   }
   
   @GetMapping("/welcome.htm")
   public ModelAndView helloworld(){
      Map<String, String> model = new HashMap<>();
      model.put("message", "This is a test message.");
      System.out.println("welcome");
      return new ModelAndView("welcome", model);
   }
}
