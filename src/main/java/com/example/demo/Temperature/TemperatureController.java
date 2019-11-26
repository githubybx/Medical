package com.example.demo.Temperature;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemperatureController {
    @Autowired
    TemperatureService temperatureService;
    @RequestMapping("/getTemperature")
    public List getTemperature() {
        List select = temperatureService.select("15691769209");
        return select;
    }
}
