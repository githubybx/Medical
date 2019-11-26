package com.example.demo.UserTable;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {
 //#{}和数据库中的字段保持一致
 @Select("SELECT * FROM suser WHERE phone = #{phone} AND pass = #{pass}")
  public User select(@Param("phone") String phone, @Param("pass") String pass);
 @Select("SELECT * FROM suser WHERE phone = #{phone}")
 public User selectPhone(@Param("phone") String phone);
 @Insert("insert into suser (phone,pass) values (#{phone},#{pass})")
 public void insert(@Param("phone")String phone,@Param("pass")String pass);
}
