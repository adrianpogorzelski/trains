package com.example.trains;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DashboardController {

    @GetMapping
    public ModelAndView dashboard() {
        ModelAndView mav = new ModelAndView("dashboard");
        return mav;
    }
}
