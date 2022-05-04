package com.balakumar.eazyschool.service;


import com.balakumar.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactService.class);

    public String saveMessage(Contact contacts) {
        //To persist the data to DB
        log.info(contacts.toString());
        return "true";


    }

}
