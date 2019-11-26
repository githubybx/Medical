package com.example.demo.Info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired
    InfoDao infoDao;
    public UserInfo select(String phone){
        return infoDao.select(phone);
    }
    public void insert(String age,  String sex,String height, String weight,String identify, String troduce, String address, String illness,String phone){
        infoDao.insert(age,sex,height,weight,identify,address,troduce,illness,phone);
    }
}
