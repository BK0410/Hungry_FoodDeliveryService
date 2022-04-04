package com.Hungry.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin()
public class HungryController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String homePage() {
        return "Welcome to Hungry !";
    }
}