package com.example.demo.Info;

import com.example.demo.UserTable.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    InfoService infoService;
    @RequestMapping("/editInfo")
    public void addData(@RequestParam("age")String age,@RequestParam("height")String height,@RequestParam("weight")String weight,
                        @RequestParam("address")String address,@RequestParam("troduce")String troduce,@RequestParam("sex")String sex,
                        @RequestParam("illness")String illness, @RequestParam("identify")String identify,@RequestParam("phone")String phone){
        UserInfo userInfo = new UserInfo(phone, age, sex, height, weight, identify, address, troduce, illness);
        infoService.insert(age,sex,height,weight,phone,troduce,address,illness,identify);


    }
}
