package com.bandeira.tweeteroospringbootapi.controllers;

import com.bandeira.tweeteroospringbootapi.dtos.CreateUserDto;
import com.bandeira.tweeteroospringbootapi.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public HttpStatus saveUser(@RequestBody @Valid CreateUserDto req) {
        
        userService.save(req);
        return HttpStatus.CREATED;
    }
}
