package com.xwx.springcloud.core.model.bo.base;

import lombok.Data;

import java.util.Date;

/**
 * @author winsonxiao
 * @ClassName BaseBo
 * @date 2021/10/9、9:14 下午
 */
@Data
public class BaseBo extends AbstractBo{
    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
