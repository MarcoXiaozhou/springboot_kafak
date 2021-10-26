package com.baoshan.shanghai.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baoshan.shanghai.project.entity.User;
import com.baoshan.shanghai.project.service.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-10-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list")
    public List<User> getUserList() {
        List<User> list = userService.list();
        return list;

    }

}
