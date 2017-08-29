package com.logibeat.cloud.showcase.web.controller;

import com.logibeat.cloud.showcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Object test() {
        return userService.test();
    }
}
