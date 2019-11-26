package com.example.demo.Temperature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureService {
    @Autowired
    TemperatureDao temperatureDao;
    public List select(String phone){
        List select = temperatureDao.select(phone);
        return select;
    }
}
