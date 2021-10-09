package com.xwx.springcloud.api.dto.resp.Index;

import lombok.Data;

import java.util.Date;

/**
 * @author winsonxiao
 * @ClassName QueryDiscussPostRespDto
 * @date 2021/10/9、9:31 下午
 */
@Data
public class QueryDiscussPostRespDto {

    private Integer id;

    private String userId;

    private String title;

    private Integer type;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer commentCount;

    private Double score;

    private String content;

}
