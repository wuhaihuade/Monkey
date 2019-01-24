package com.mkwhh.mkboot.controller;

import com.mkwhh.mkboot.model.SysUser;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public SysUser getUser() {
        SysUser user = new SysUser();
        user.setName("test");
        return user;
    }
}