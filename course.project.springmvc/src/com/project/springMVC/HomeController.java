package com.project.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home") //Parent Mapping
public class HomeController {

    // Child Mapping

    @RequestMapping("showForm")
    public String showForm(){
        return "form-page";
    }

    @RequestMapping("processForm")
    public String processForm(){
        return "result-page";
    }

    @RequestMapping("processForm2")
    public String processForm2(HttpServletRequest request, Model model){
        String name = request.getParameter("studentname");
        String message = "Ecco il tuo nome in maiuscolo: "+name.toUpperCase();
        model.addAttribute("message", message);
        return "result-page2";
    }

    @RequestMapping("processForm3")
    public String processForm3(@RequestParam("studentname") String name, Model model){
        String message = "Ecco il tuo nome in maiuscolo: "+name.toUpperCase();
        model.addAttribute("message", message);
        return "result-page2";
    }




}
