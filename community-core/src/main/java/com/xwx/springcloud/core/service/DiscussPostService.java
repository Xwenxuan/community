package com.xwx.springcloud.core.service;

import com.github.pagehelper.PageInfo;
import com.xwx.springcloud.core.model.DiscussPostEntity;
import com.xwx.springcloud.core.model.bo.Index.QueryDiscussPostBo;

/**
 * @author winsonxiao
 * @ClassName DiscussPostService
 * @date 2021/10/9、9:44 下午
 */
public interface DiscussPostService {
    PageInfo<DiscussPostEntity> query(QueryDiscussPostBo queryDiscussPostBo);
}
