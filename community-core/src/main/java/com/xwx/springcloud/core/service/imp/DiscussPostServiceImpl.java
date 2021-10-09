package com.xwx.springcloud.core.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xwx.springcloud.core.dao.DiscussPostEntityMapper;
import com.xwx.springcloud.core.model.DiscussPostEntity;
import com.xwx.springcloud.core.model.bo.Index.QueryDiscussPostBo;
import com.xwx.springcloud.core.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author winsonxiao
 * @ClassName DiscussPostServiceImpl
 * @date 2021/10/9、9:45 下午
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Autowired
    private DiscussPostEntityMapper discussPostEntityMapper;

    @Override
    public PageInfo<DiscussPostEntity> query(QueryDiscussPostBo queryDiscussPostBo) {
        PageHelper.startPage(queryDiscussPostBo.getPageNum(),queryDiscussPostBo.getPageSize());
        List<DiscussPostEntity> list = discussPostEntityMapper.selectAll(queryDiscussPostBo);
        return new PageInfo<>(list);
    }
}
