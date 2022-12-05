package com.nest.libraryapp_backend.controller;

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
}
