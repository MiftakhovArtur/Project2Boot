package com.springcourse.Project2Boot.service;

import com.springcourse.Project2Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUser(Long id);
}