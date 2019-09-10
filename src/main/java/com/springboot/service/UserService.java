package com.springboot.service;

import com.springboot.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> list();//查询
    public  void  adduser(String name);
    public  User updateone(Integer id);
    public  void  updatetwo(User user);
    public  void delete(Integer id);
}
