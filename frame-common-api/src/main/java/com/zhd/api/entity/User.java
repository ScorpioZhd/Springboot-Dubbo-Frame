package com.zhd.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体
 * @author scorpiohd
 */
public class User implements Serializable {
    Long id;
    String name;
    Integer age;
    Date ctm;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Date getCtm() {
        return ctm;
    }

    public User setCtm(Date ctm) {
        this.ctm = ctm;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ctm=" + ctm +
                '}';
    }
}
