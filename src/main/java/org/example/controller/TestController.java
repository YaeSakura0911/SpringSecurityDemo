package org.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        // 获取用户登录信息
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.toString();
    }
}
