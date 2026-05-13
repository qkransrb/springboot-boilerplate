package com.example.demo.user.controller;

import com.example.demo.common.security.CustomUserDetails;
import com.example.demo.common.security.annotation.CurrentUser;
import com.example.demo.common.security.annotation.UserOrAdmin;
import com.example.demo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    @UserOrAdmin
    public String getProfile(@CurrentUser CustomUserDetails userDetails) {
        return userDetails.getUsername();
    }
}
