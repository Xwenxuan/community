package com.xwx.springcloud.api.proxy.admin;

import com.xwx.springcloud.api.constants.FeignClientsConstant;
import com.xwx.springcloud.api.dto.NoBody;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.Student.DescStudentReqDto;
import com.xwx.springcloud.api.dto.resp.Student.DescStudentRespDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author winsonxiao
 * @ClassName TemplateProxy
 * @date 2021/9/29、11:26 上午
 */
@FeignClient(contextId = FeignClientsConstant.Admin.TEMPLATE, name = FeignClientsConstant.Admin.APPLICATION_NAME, path = "/template")
public interface TemplateProxy {

    @ApiOperation(value = "模版", notes = "模版")
    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result<DescStudentRespDto> templatePost(@Validated @RequestBody DescStudentReqDto descStudentReqDto);
}
