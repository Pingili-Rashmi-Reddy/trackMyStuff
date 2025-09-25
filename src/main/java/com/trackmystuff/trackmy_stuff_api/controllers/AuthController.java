package com.trackmystuff.trackmy_stuff_api.controllers;

import com.trackmystuff.trackmy_stuff_api.dto.RegistrationRequest;
import com.trackmystuff.trackmy_stuff_api.models.User;
import com.trackmystuff.trackmy_stuff_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegistrationRequest registrationRequest) {
        User newUser = new User();
        newUser.setName(registrationRequest.getName());
        newUser.setEmail(registrationRequest.getEmail());
        newUser.setPasswordHash(registrationRequest.getPassword()); // The service will hash it

        User createdUser = userService.createUser(newUser);
        return ResponseEntity.ok("User registered successfully!");
    }
}