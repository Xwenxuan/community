package com.xwx.springcloud.api.dto.req.index;

import com.xwx.springcloud.api.dto.req.base.PageBaseReqDto;
import lombok.Data;

/**
 * @author winsonxiao
 * @ClassName QueryDiscussPostReqDto
 * @date 2021/10/9、9:26 下午
 */
@Data
public class QueryDiscussPostReqDto extends PageBaseReqDto {

    private Integer userId;
}
