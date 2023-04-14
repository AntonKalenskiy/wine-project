package com.project.wineshop.service;

import com.project.wineshop.model.User;

import java.util.Optional;

public interface UserService extends GenericService<User> {
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);

}

