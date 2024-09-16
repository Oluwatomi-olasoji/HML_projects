package com.example.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
     return "Welcome Tomi";
 }
    @RequestMapping("/about")
    public String about(){
        return "Tomi is a beautiful girl, as bright as the Sun";
    }


}
