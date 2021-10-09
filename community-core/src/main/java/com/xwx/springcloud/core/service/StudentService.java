package com.xwx.springcloud.core.service;

import com.xwx.springcloud.core.model.StudentEntity;

/**
 * @author winsonxiao
 * @ClassName StudentService
 * @date 2021/9/29、3:04 下午
 */
public interface StudentService {

    StudentEntity selectAll(Long id);
}
