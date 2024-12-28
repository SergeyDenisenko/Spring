package com.example.hw4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.hw4.domain.User;

@Component
public class UserRepository {

    private List<User> users = new ArrayList();
    
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
