package com.xwx.springcloud.core.service.imp;

import cn.hutool.core.bean.BeanUtil;
import com.xwx.springcloud.core.dao.UserEntityMapper;
import com.xwx.springcloud.core.model.UserEntity;
import com.xwx.springcloud.core.model.bo.user.DescUserBo;
import com.xwx.springcloud.core.model.bo.user.InsertUserBo;
import com.xwx.springcloud.core.service.UserService;
import com.xwx.springcloud.core.utils.CommonUtil;
import com.xwx.springcloud.core.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author winsonxiao
 * @ClassName UserServiceImpl
 * @date 2021/10/11、7:50 下午
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Autowired
    private MailUtil mailUtil;

    @Override
    public UserEntity descUser(DescUserBo descUserBo) {
        Integer id = descUserBo.getId();
        return userEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserEntity registerUser(InsertUserBo insertUserBo) {
        String username = insertUserBo.getUsername();
        String email = insertUserBo.getEmail();
        UserEntity userEntityForUsername = userEntityMapper.selectByUsername(username);
        if(userEntityForUsername == null) {
            // todo 抛异常
        }
        UserEntity userEntityForEmail = userEntityMapper.selectByEmail(email);

        if(userEntityForEmail == null) {
            //todo 抛异常
        }

        //用户注册
        UserEntity userEntity = BeanUtil.copyProperties(insertUserBo,UserEntity.class);
        userEntity.setSalt(CommonUtil.generateUUID());
        userEntity.setPassword(CommonUtil.md5(insertUserBo.getPassword() + userEntity.getSalt()));
        userEntityMapper.insert(userEntity);
        return userEntity;
    }
}
