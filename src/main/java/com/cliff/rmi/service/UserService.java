package com.cliff.rmi.service;

import com.cliff.rmi.domain.User;

import java.util.List;

/**
 * Get a random User
 * User: Cliff
 */
public interface UserService {

    User getRandomUser();

    List<User> getAllUsers();
}
