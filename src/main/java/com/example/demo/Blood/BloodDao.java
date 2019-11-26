package com.example.demo.Blood;

import com.example.demo.Blood.Blood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface BloodDao {
    @Select("select * from blood where phone = #{phone}")
    public List<Blood> select(String phone);
}
