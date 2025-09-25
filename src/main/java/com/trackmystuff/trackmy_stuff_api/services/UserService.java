package com.trackmystuff.trackmy_stuff_api.services;

import com.trackmystuff.trackmy_stuff_api.models.User;
import com.trackmystuff.trackmy_stuff_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Marks this as a Spring Service (for business logic)
public class UserService {

    @Autowired // Spring automatically injects an instance of UserRepository
    private UserRepository userRepository;

    public User createUser(User user) {
        // In a real application, you would add logic here to hash the password
        // before saving. For now, we just save the object.
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}