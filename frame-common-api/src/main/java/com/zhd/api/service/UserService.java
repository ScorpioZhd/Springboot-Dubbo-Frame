package com.zhd.api.service;
import com.zhd.api.entity.User;

/**
 * @author scorpiohd
 */
public interface UserService {

    /** 根据id获取用户信息
     * @param id
     * @return User
     */
    User getUserById(Long id);
}
