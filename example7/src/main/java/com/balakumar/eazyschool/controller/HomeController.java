package com.balakumar.eazyschool.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value={"","/","home"})
    public  String displayName(Model model)
    {
        model.addAttribute("username", "Krithiga Balakumar");
        return  "home.html";
    }
}
