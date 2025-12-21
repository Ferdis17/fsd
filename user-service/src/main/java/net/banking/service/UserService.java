package net.banking.service;

import net.banking.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    List<User> getAllUser();
}
