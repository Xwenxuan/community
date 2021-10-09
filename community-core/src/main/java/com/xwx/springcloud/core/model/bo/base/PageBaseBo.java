package com.xwx.springcloud.core.model.bo.base;

import lombok.Data;

/**
 * @author winsonxiao
 * @ClassName PageBaseBo
 * @date 2021/10/9、9:12 下午
 */
@Data
public class PageBaseBo extends BaseBo{

    private static final long serialVersionUID = 1L;
    public static final int PAGE_NUM = 1;
    public static final int PAGE_SIZE = 1000;

    private Integer pageNum;

    private Integer pageSize;

    private String orderBy;
}
