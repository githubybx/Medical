package com.example.demo.Blood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BloodController {
    @Autowired
    BloodService bloodService;
    @RequestMapping("/getBlood")
    public List getBlood(@RequestParam("phone")String phone){
        return bloodService.select(phone);
    }
}
