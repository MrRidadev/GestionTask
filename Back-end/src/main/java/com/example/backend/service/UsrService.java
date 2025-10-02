package com.example.backend.service;

import com.example.backend.entity.user;
import com.example.backend.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UsrService {

    private final UserRepository userRepository;

    public UsrService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public user createUser(user User) {
        return userRepository.save(User);
    }

}
