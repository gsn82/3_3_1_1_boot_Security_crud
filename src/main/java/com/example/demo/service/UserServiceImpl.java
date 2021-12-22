package com.example.demo.service;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    public void addUser(User user, String[] roles) {
        userDAO.addUser(user, roles);
    }

    @Override
    public void removeUser(Long id) {
        userDAO.removeUser(id);
    }

    @Override
    public void updateUser(User user, String[] roles) {
        userDAO.updateUser(user, roles);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User loadUserByUsername(String s) {
        return userDAO.loadUserByUsername(s);
    }
}
