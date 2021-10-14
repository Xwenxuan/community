package com.xwx.springcloud.api.proxy.community;

import com.github.pagehelper.PageInfo;
import com.xwx.springcloud.api.constants.FeignClientsConstant;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.index.QueryDiscussPostReqDto;
import com.xwx.springcloud.api.dto.req.user.DescUserReqDto;
import com.xwx.springcloud.api.dto.req.user.InsertUserReqDto;
import com.xwx.springcloud.api.dto.resp.Index.QueryDiscussPostRespDto;
import com.xwx.springcloud.api.dto.resp.user.DescUserRespDto;
import com.xwx.springcloud.api.dto.resp.user.InsertUserRespDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author winsonxiao
 * @ClassName IndexProxy
 * @date 2021/10/9、8:43 下午
 */
@FeignClient(contextId = FeignClientsConstant.Community.USER, name = FeignClientsConstant.Community.APPLICATION_NAME, path = "/user")
public interface UserProxy {


    @ApiOperation(value = "查询某用户", notes = "查询某用户")
    @RequestMapping(value = "/desc", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result<DescUserRespDto> descUser(@Validated @RequestBody DescUserReqDto descUserReqDto);

    @ApiOperation(value = "用户注册", notes = "查询某用户")
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result<InsertUserRespDto> registerUser(@Validated @RequestBody InsertUserReqDto insertUserReqDto);


    @ApiOperation(value = "获取验证码", notes = "获取验证码")
    @RequestMapping(value = "/kaptcha", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void registerUser(HttpServletResponse response, HttpSession httpSession);
}
