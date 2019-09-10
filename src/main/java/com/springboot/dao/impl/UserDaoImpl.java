package com.springboot.dao.impl;

import com.springboot.dao.UserDao;
import com.springboot.pojo.MyRowMapper;
import com.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> list() {

        String sql="select * from users";
       List<User> list= jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    @Override
    public void updatetwo(User user) {
        String sql="update users set name=? where id=?";
        jdbcTemplate.update(sql,user.getName(),user.getId());
    }

    @Override
    public void delete(Integer id) {
        String sql="delete from users where id=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public User updateone(Integer id) {
        String sql="select * from users where id=?";
       Object o=jdbcTemplate.queryForObject(sql, new MyRowMapper(),id);

       return (User) o;
    }

    @Override
    public void adduser(String name) {
        String sql="insert users VALUES(NULL,?)";
        jdbcTemplate.update(sql,name);

    }
}
