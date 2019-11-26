package com.example.demo.Pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class pulseService {
    @Autowired
    pulseDao pulseDao;
    public List select(String phone){
        return pulseDao.select(phone);
    }
}
