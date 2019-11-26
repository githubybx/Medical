package com.example.demo.Blood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodService {
    @Autowired
    BloodDao bloodDao;
    public List<Blood> select(String phone){
        return bloodDao.select(phone);
    }
}
