package com.bandeira.tweeteroospringbootapi.services;

import com.bandeira.tweeteroospringbootapi.dtos.CreateUserDto;
import com.bandeira.tweeteroospringbootapi.models.User;
import com.bandeira.tweeteroospringbootapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public HttpStatus save(CreateUserDto req) {
        userRepository.save(new User(req.username(), req.avatar()));
        return HttpStatus.CREATED;
    }

}
