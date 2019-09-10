package com.springboot.mapper;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> list();
    public  void addUser(String name);//添加
    public  User updateone(Integer id);
    public  void  updatetwo(User user);
    public  void delete(Integer id);


}
