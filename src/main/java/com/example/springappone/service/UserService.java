package com.example.springappone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springappone.entity.Usermodel;
import com.example.springappone.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Usermodel> getAllusers(){
        return userRepository.findAll();
    }
}
