package com.changqin.fast.controller;

import com.changqin.fast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/index/data")
    @ResponseBody
    public Mono indexData(){
        return Mono.just(userService.findUser());
    }
}
