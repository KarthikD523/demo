package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dtos.UserDto;
import com.example.demo.Entity.User;
import com.example.demo.Repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }   
    
    public User addUser(UserDto userdto) {

        if (userdto.getName() == null || userdto.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        User user = new User();
        user.setName(userdto.getName());
        user.setEmail(userdto.getEmail());
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
