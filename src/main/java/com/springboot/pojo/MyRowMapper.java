package com.springboot.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));

        return user;
    }
}
