package com.zhd.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhd.api.entity.User;
import com.zhd.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhd.provider.dao.UserDao;

/**
 * @author scorpiohd
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Long id) {
        User user = userDao.getUserById(id);
        System.err.println(user);
        return user;
    }
}
