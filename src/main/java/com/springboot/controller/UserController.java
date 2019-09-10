package com.springboot.controller;

import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/aaa")
public class UserController {
    @Autowired
    private UserService userService;

//这是查询
    @RequestMapping("/bbb")
    public  String list(Model model){
    List<User> list= userService.list();
    model.addAttribute("lists",list);
    return  "user";
    }

    @RequestMapping("/add")
    public  String add(){

        return  "adduser";
    }
//添加
    @RequestMapping("/adduser")
    public  String adduser(String name){
        userService.adduser(name);

        return "redirect:/aaa/bbb";

    }


    //修改——查询（1）
    @RequestMapping("/updateone")
    public  String updateone(Integer id,Model model){
       User user= userService.updateone(id);
        model.addAttribute("user",user);
        return  "updateuser";
    }

    @RequestMapping("/updatetwo")
    public  String updatetwo(User user){
        userService.updatetwo(user);
        return "redirect:/aaa/bbb";
    }

    @RequestMapping("/delete")
    public  String delete(Integer id){
        userService.delete(id);
        return "redirect:/aaa/bbb";
    }

}
