package com.springcourse.Project2Boot.dao;

import com.springcourse.Project2Boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUser(Long id);
}