package com.bowen.ironmanweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartController {

  @RequestMapping("/chart")
  public String showChart(){
    ModelAndView modelAndView = new ModelAndView("charts/chart");
    return "charts/chart";
  }
}
