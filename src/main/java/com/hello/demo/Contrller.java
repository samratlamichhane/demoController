package com.hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class Contrller {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String hello(ModelMap modelMap) {
        modelMap.put("userTypes", UserType.values());
        modelMap.put("users",userService.finaAll(0).getContent());
        return "user";
    }

    @PostMapping("/users")
    public String addUser(@ModelAttribute User user,ModelMap modelMap) {
        userService.save(user);

        modelMap.put("users",userService.findAll());
        return "added";
    }
    @GetMapping("/users/all")
    public String hellop(ModelMap modelMap) {
        modelMap.put("users", userService.finaAll(1));
        return "nav";
    }

}
