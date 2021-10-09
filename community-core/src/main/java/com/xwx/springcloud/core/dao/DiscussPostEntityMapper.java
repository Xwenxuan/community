package com.xwx.springcloud.core.dao;

import com.xwx.springcloud.core.model.DiscussPostEntity;
import com.xwx.springcloud.core.model.bo.Index.QueryDiscussPostBo;

import java.util.List;

public interface DiscussPostEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiscussPostEntity record);

    int insertSelective(DiscussPostEntity record);

    DiscussPostEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiscussPostEntity record);

    int updateByPrimaryKeyWithBLOBs(DiscussPostEntity record);

    int updateByPrimaryKey(DiscussPostEntity record);

    List<DiscussPostEntity> selectAll(QueryDiscussPostBo queryDiscussPostBo);
}