package com.user.service;

import com.user.Exception.ResourceNotFoundException;
import com.user.entity.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return repository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User with given id was not found " + userId));
    }

}
