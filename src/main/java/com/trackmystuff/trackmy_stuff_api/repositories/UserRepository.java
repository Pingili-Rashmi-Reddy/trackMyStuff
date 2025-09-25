package com.trackmystuff.trackmy_stuff_api.repositories;

import com.trackmystuff.trackmy_stuff_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a Spring Data repository
public interface UserRepository extends JpaRepository<User, Long> {
    // By extending JpaRepository, we get a lot of free methods for our database:
    // save(), findById(), findAll(), delete(), etc.
    // We don't need to write any code here for basic CRUD operations!
}