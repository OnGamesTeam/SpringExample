package com.project.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "home-page";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "form-page";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "result-page";
    }


}
