package com.xwx.springcloud.core.dao;

import com.xwx.springcloud.core.model.StudentEntity;

public interface StudentEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    StudentEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}