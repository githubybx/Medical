package com.example.demo.UserTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User select(String phone, String pass){
        return userDao.select(phone, pass);
    }
    public User selectPhone(String phone){
        return userDao.selectPhone(phone);
    }
    public void insert(String phone, String password){userDao.insert(phone,password);}
}
