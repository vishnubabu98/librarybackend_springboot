package com.nest.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/")
    public String AdminPage()
    {
        return "welcome to admin page";
    }
    @PostMapping("/userlogin")
    public String UserPage()
    {
        return "welcome to user login page";
    }
    @PostMapping("/userreg")
    public String UserRegPage()
    {
        return "welcome to user registeration page";
    }
    @PostMapping("/add")
    public String AddPage()
    {
        return "welcome to book adding page";
    }
    @GetMapping("/view")
    public String ViewPage()
    {
        return "welcome to viewbooks page";
    }
    @PostMapping("/search")
    public String SearchPage()
    {
        return "welcome to search page";
    }
}
