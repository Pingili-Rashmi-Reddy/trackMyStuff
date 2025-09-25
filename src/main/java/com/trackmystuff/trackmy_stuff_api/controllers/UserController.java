package com.trackmystuff.trackmy_stuff_api.controllers;

import com.trackmystuff.trackmy_stuff_api.models.User;
import com.trackmystuff.trackmy_stuff_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This combines @Controller and @ResponseBody, creating a REST controller
@RequestMapping("/api/users") // All requests to /api/users will come to this controller
public class UserController {

    @Autowired // Spring injects the UserService
    private UserService userService;

    // Handles HTTP POST requests to /api/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Handles HTTP GET requests to /api/users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}