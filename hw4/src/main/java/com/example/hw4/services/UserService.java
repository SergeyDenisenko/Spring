package com.example.hw4.services;

import com.example.hw4.domain.User;
import com.example.hw4.services.NotificationService;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private NotificationService notificationService;
 
    // Внедрение зависимости через конструктор
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
 
    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
       
        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);
 
        return user;
    }
}
