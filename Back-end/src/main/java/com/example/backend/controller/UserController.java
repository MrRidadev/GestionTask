package com.example.backend.controller;

import com.example.backend.entity.user;
import com.example.backend.service.UsrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/User")
@RestController
public class UserController {

    private UsrService usrService;

    public UserController(UsrService usrService) {
        this.usrService = usrService;
    }

    @PostMapping("/createUser")
    public user createUser(@RequestBody user user) {
        return usrService.createUser(user);
    }
}
