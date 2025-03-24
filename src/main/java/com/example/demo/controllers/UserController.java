package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dtos.UserDto;
import com.example.demo.Entity.User;
import com.example.demo.Services.UserService;

@RestController
public class UserController {
      private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

     @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody UserDto user) {
        User savedUser = userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }


}
