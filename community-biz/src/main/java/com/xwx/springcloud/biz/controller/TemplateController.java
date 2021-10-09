package com.xwx.springcloud.biz.controller;

import cn.hutool.core.bean.BeanUtil;
import com.xwx.springcloud.api.dto.NoBody;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.Student.DescStudentReqDto;
import com.xwx.springcloud.api.dto.resp.Student.DescStudentRespDto;
import com.xwx.springcloud.api.proxy.admin.TemplateProxy;
import com.xwx.springcloud.core.model.StudentEntity;
import com.xwx.springcloud.core.model.bo.DescStudentBo;
import com.xwx.springcloud.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author winsonxiao
 * @ClassName TemplateController
 * @date 2021/9/29、11:30 上午
 */
@RestController
@RequestMapping(value = "/template")
public class TemplateController implements TemplateProxy {


    @Autowired
    private StudentService studentService;

    @Override
    public Result<DescStudentRespDto> templatePost(DescStudentReqDto descStudentReqDto) {
        DescStudentBo descStudentBo = BeanUtil.copyProperties(descStudentReqDto, DescStudentBo.class);
        StudentEntity studentEntity = studentService.selectAll(descStudentBo.getId());
        DescStudentRespDto descStudentRespDto = BeanUtil.copyProperties(studentEntity,DescStudentRespDto.class);
        BeanUtil.copyProperties(studentEntity,descStudentRespDto);
        return Result.buildSucess(descStudentRespDto);

    }
}
