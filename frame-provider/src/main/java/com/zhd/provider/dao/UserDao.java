package com.zhd.provider.dao;

import com.zhd.api.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author scorpiohd
 */
public interface UserDao {

    /**
     * 根据用户id获取用户详情
     * @param id user.id
     * @return User
     */
    User getUserById(@Param("id") Long id);
}
