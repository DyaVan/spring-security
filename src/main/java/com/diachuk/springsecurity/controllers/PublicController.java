package com.diachuk.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicController {

    @GetMapping("/notices")
    public String getNotices() {
        return "Notices";
    }

    @GetMapping("/about")
    public String about() {
        return "Demo application.";
    }
}
