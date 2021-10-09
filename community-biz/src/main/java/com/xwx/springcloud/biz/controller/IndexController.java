package com.xwx.springcloud.biz.controller;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.index.QueryDiscussPostReqDto;
import com.xwx.springcloud.api.dto.resp.Index.QueryDiscussPostRespDto;
import com.xwx.springcloud.api.proxy.community.IndexProxy;
import com.xwx.springcloud.core.model.DiscussPostEntity;
import com.xwx.springcloud.core.model.bo.Index.QueryDiscussPostBo;
import com.xwx.springcloud.core.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author winsonxiao
 * @ClassName IndexController
 * @date 2021/10/9、8:41 下午
 */
public class IndexController implements IndexProxy {

    @Autowired
    private DiscussPostService discussPostService;

    @Override
    public Result<PageInfo<QueryDiscussPostRespDto>> listArticle(QueryDiscussPostReqDto queryDiscussPostReqDto) {
        QueryDiscussPostBo queryDiscussPostBo = BeanUtil.copyProperties(queryDiscussPostReqDto,QueryDiscussPostBo.class);
        PageInfo<DiscussPostEntity> page = discussPostService.query(queryDiscussPostBo);
        PageInfo<QueryDiscussPostRespDto> pageInfo = new PageInfo<>();
        BeanUtil.copyProperties(page,pageInfo);
        List<QueryDiscussPostRespDto> queryDiscussPostRespDtos = page.getList().stream().map(item -> {
            QueryDiscussPostRespDto queryDiscussPostRespDto = new QueryDiscussPostRespDto();
            BeanUtil.copyProperties(item,queryDiscussPostRespDto);
            return queryDiscussPostRespDto;
        }).collect(Collectors.toList());
        pageInfo.setList(queryDiscussPostRespDtos);
        return Result.buildSucess(pageInfo);
    }

}
