package com.example.admin.controller;

import com.example.admin.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class LoginController {

    @PostMapping("register")
    @ResponseBody
    public Result<String> add(String age, String email) {
        System.out.println("----" + age);
        System.out.println("----" + email);
        return new Result<>("200", "注册成功");
    }

    @PostMapping("login")
    @ResponseBody
//    @CrossOrigin
    public Result<String> login(String name, String password) {
        System.out.println("name:" + name);
        if ("123".equals(name) && "123".equals(password)) {
            return new Result<>("200","token123456");
        }
        return new Result<>("403","沒有权限");
    }
}
