package com.vot47.testregistration.service;

import com.vot47.testregistration.entity.User;
import com.vot47.testregistration.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    private BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public void saveUser(User user) {
        user.setPassword(encoder().encode(user.getPassword()));
        userRepository.save(user);
    }
}
