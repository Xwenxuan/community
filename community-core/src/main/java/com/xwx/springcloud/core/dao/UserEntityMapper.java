package com.xwx.springcloud.core.dao;

import com.xwx.springcloud.core.model.UserEntity;

public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity selectByUsername(String username);

    UserEntity selectByEmail(String email);
}