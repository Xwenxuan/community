package com.xwx.springcloud.core.service;

import com.xwx.springcloud.core.model.UserEntity;
import com.xwx.springcloud.core.model.bo.user.DescUserBo;
import com.xwx.springcloud.core.model.bo.user.InsertUserBo;

/**
 * @author winsonxiao
 * @ClassName UserService
 * @date 2021/10/11、7:49 下午
 */
public interface UserService {


    UserEntity descUser(DescUserBo descUserBo);


    UserEntity registerUser(InsertUserBo insertUserBo);
}
