package com.balakumar.eazyschool.controller;

import com.balakumar.eazyschool.model.Contact;
import com.balakumar.eazyschool.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {


    @Autowired
    private ContactService service;

    @RequestMapping(value = {"/contact"})
    public String displayName() {

        return "contact.html";
    }

    @RequestMapping(value = "/saveMsg", method= POST)
    public ModelAndView saveMessage(Contact contact) {

       service.saveMessage(contact);
        return new ModelAndView("redirect:/contact");
    }



}
