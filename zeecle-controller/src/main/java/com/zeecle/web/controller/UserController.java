package com.zeecle.web.controller;

import com.zeecle.web.api.UserService;
import com.zeecle.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by towey on 2018/6/6.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "")
    public String init(ModelMap model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "index";
    }
}
