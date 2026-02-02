package com.multivendor.ecommerce.controller;

import com.multivendor.ecommerce.model.User;
import com.multivendor.ecommerce.repository.UserRepository;
import com.multivendor.ecommerce.response.SingUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//for database
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;

    @PostMapping("/signUp")
    public ResponseEntity<User> createUserHandler(@RequestBody SingUpRequest req){
        User user=new User();
        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());
        User savedUser=userRepository.save(user);
        return ResponseEntity.ok(savedUser);

    }
}
