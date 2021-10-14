package com.xwx.springcloud.biz.controller;

import cn.hutool.core.bean.BeanUtil;
import com.google.code.kaptcha.Producer;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.user.DescUserReqDto;
import com.xwx.springcloud.api.dto.req.user.InsertUserReqDto;
import com.xwx.springcloud.api.dto.resp.user.DescUserRespDto;
import com.xwx.springcloud.api.dto.resp.user.InsertUserRespDto;
import com.xwx.springcloud.api.proxy.community.UserProxy;
import com.xwx.springcloud.core.model.UserEntity;
import com.xwx.springcloud.core.model.bo.user.DescUserBo;
import com.xwx.springcloud.core.model.bo.user.InsertUserBo;
import com.xwx.springcloud.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author winsonxiao
 * @ClassName UserController
 * @date 2021/10/11、7:37 下午
 */
public class UserController implements UserProxy {

    @Autowired
    private UserService userService;
    @Autowired
    private Producer kaptchaProducer;

    @Override
    public Result<DescUserRespDto> descUser(DescUserReqDto descUserReqDto) {
        DescUserBo descUserBo = BeanUtil.copyProperties(descUserReqDto, DescUserBo.class);
        UserEntity userEntity =  userService.descUser(descUserBo);
        DescUserRespDto descUserRespDto =  BeanUtil.copyProperties(userEntity,DescUserRespDto.class);
        return Result.buildSucess(descUserRespDto);
    }

    @Override
    public Result<InsertUserRespDto> registerUser(InsertUserReqDto insertUserReqDto) {
        InsertUserBo insertUserBo = BeanUtil.copyProperties(insertUserReqDto,InsertUserBo.class);
        UserEntity userEntity = userService.registerUser(insertUserBo);

        return null;
    }

    @Override
    public void registerUser(HttpServletResponse response, HttpSession httpSession) {
        String text = kaptchaProducer.createText();
        BufferedImage bufferedImage =  kaptchaProducer.createImage(text);
        httpSession.setAttribute("kaptcha", text);
        response.setContentType("img/png");
        try {
            OutputStream os = response.getOutputStream();
            ImageIO.write(bufferedImage,"png",os);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
