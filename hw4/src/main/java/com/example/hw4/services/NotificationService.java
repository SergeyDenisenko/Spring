package com.example.hw4.services;

import org.springframework.stereotype.Service;

import com.example.hw4.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
    
}
