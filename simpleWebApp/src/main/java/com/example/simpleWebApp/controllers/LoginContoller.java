package com.example.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginContoller {

        @RequestMapping("/login")
        public String login() {
            return "logging in";
        }

}
