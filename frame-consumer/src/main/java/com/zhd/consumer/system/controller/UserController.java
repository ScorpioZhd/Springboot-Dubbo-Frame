package com.zhd.consumer.system.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.zhd.api.entity.User;
import com.zhd.api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author scorpiohd
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    UserService userServiceImpl;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(Long id) {
        User user=userServiceImpl.getUserById(id);
        System.err.println(user.toString());
        System.out.println("========================");
        return JSON.toJSONString(user);
    }
}
