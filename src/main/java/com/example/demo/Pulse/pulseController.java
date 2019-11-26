package com.example.demo.Pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class pulseController {
    @Autowired
    pulseService pulseService;
    @RequestMapping("/getPulse")
    public List select(@RequestParam("phone") String phone){
       return pulseService.select(phone);
    }
}
