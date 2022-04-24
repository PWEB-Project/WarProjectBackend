package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.User;
import com.pweb.WarInNewWorld.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user)
    {
        userRepository.save(user);
    }
}
