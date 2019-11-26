package com.example.demo.Pulse;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface pulseDao {
    @Select("select * from pulse where phone=#{phone}")
    public List<pulse> select(String phone);
}
