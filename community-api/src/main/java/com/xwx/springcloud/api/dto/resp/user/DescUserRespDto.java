package com.xwx.springcloud.api.dto.resp.user;

import lombok.Data;

import java.util.Date;

/**
 * @author winsonxiao
 * @ClassName DescUserRespDto
 * @date 2021/10/11、7:44 下午
 */
@Data
public class DescUserRespDto {

    private Integer id;

    private String username;

    private String email;

    private Integer type;

    private Integer status;

//    private String activationCode;

    private String headerUrl;

    private Date createTime;
}
