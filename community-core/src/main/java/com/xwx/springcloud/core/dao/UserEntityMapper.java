package com.xwx.springcloud.core.dao;

import com.xwx.springcloud.core.model.UserEntity;

public interface UserEntityMapper {
    int insert(UserEntity record);

    int insertSelective(UserEntity record);
}