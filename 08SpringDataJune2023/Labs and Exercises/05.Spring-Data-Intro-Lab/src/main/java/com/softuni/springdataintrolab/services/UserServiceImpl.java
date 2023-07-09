package com.softuni.springdataintrolab.services;

import com.softuni.springdataintrolab.models.User;
import com.softuni.springdataintrolab.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(User user) {
        Optional<User> byUsername = userRepository.findByUsername(user.getUsername());

        if (byUsername.isPresent()) {
            throw new IllegalArgumentException("Username already exist");
        }

        userRepository.save(user);
    }
}
