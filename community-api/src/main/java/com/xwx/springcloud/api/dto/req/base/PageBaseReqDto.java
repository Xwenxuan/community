package com.xwx.springcloud.api.dto.req.base;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author winsonxiao
 * @ClassName PageBaseReqDto
 * @date 2021/10/9、9:20 下午
 */
@Data
public class PageBaseReqDto extends BaseReqDto{

    private static final long serialVersionUID = 1L;

    @Min(value = 1, message = "pageNum不能小于1")
    private Integer pageNum = 1;

    @Min(value = 1, message = "pageSize不能小于1")
    @Max(value = 1000, message = "pageSize不能大于1000")
    private Integer pageSize = 20;
}
