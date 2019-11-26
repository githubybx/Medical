package com.example.demo.Info;

import org.apache.ibatis.annotations.*;

@Mapper
public interface InfoDao {
    @Select("selec * from userinfo where phone = #{phone}")
    public UserInfo select(String phone);
    @Insert("insert into userinfo (age,sex,height,weight,identify,address,troduce,illness,phone) values (#{age},#{sex},#{height},#{weight},#{identify},#{address},#{troduce},#{illness},#{phone})")
    public void insert(@Param("age") String age, @Param("sex") String sex, @Param("height") String height, @Param("weight") String weight, @Param("identify") String identify,  @Param("address") String address,@Param("troduce") String troduce, @Param("illness") String illness,@Param("phone") String phone);
}
