package com.roy.mygithubtest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * creater:roy
 * time:2021-3-9
 * content:user
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @PostMapping("/add")
    public String add(){
        return "";
    }
}
