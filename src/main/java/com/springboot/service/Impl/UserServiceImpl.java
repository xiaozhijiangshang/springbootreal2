package com.springboot.service.Impl;

import com.springboot.dao.UserDao;
import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {




    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper mapper;//mabatis方式

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }

    @Override
    public void updatetwo(User user) {
        mapper.updatetwo(user);
    }

    @Override
    public User updateone(Integer id) {
    User user= mapper.updateone(id);
    return  user;
    }

    @Override
    public void adduser(String name) {

        mapper.addUser(name);
    }

    //查询——mapper方式
    @Override
    public List<User> list() {

       List<User> list= mapper.list();


        return list;
    }



}
