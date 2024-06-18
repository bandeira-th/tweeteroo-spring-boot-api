package com.bandeira.tweeteroospringbootapi.controllers;

import com.bandeira.tweeteroospringbootapi.dtos.CreateUserDto;
import com.bandeira.tweeteroospringbootapi.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    public HttpStatus saveUser(@RequestBody @Valid CreateUserDto req) {
        userService.saveUser(req);
        return HttpStatus.CREATED;
    }
/*
    @GetMapping(value = "/{username}")
    public ResponseEntity<GetUserResponseDto> getUser(@PathVariable String username){

        User userRecord = userService.getUserByUsername(username);
        GetUserResponseDto getUserResponseDto = userMapper.userEntityToDto(userRecord);
        return ResponseEntity.status(HttpStatus.OK).body(getUserResponseDto);


    }
*/
}
