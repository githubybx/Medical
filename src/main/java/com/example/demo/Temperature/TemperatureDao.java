package com.example.demo.Temperature;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TemperatureDao {
  @Select("SELECT * FROM temperature WHERE phone = #{phone};")
    public List<Temperature> select(String phone);
}
