package com.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController {

    @GetMapping("/users")
    public String getMessage(){
        return "Hello User, you are now inside your dashboard...";
    }

    @GetMapping("/admin")
    public String getMessageForAdmin(){
        return "Hey admin, welcome...";
    }

    @GetMapping("/")
    public String getMessageForThePublic(){
        return "This is open to everyone...";
    }
}
