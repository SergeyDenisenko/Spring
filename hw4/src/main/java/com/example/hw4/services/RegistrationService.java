package com.example.hw4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    

    public void processRegistration(String name, int age, String email)
    {
        dataProcessingService.addUserToList(userService.createUser(name, age, email));
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
