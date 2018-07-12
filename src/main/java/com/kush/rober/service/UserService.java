package com.kush.rober.service;

import com.kush.rober.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
