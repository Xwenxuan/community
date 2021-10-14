package com.xwx.springcloud.api.proxy.community;

import com.github.pagehelper.PageInfo;
import com.xwx.springcloud.api.constants.FeignClientsConstant;
import com.xwx.springcloud.api.dto.Result;
import com.xwx.springcloud.api.dto.req.index.QueryDiscussPostReqDto;
import com.xwx.springcloud.api.dto.resp.Index.QueryDiscussPostRespDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author winsonxiao
 * @ClassName IndexProxy
 * @date 2021/10/9、8:43 下午
 */
@FeignClient(contextId = FeignClientsConstant.Community.INDEX, name = FeignClientsConstant.Community.APPLICATION_NAME, path = "/index")
public interface IndexProxy {

    @ApiOperation(value = "首页文章列表", notes = "首页文章列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result<PageInfo<QueryDiscussPostRespDto>> listArticle(@Validated @RequestBody QueryDiscussPostReqDto queryDiscussPostReqDto);

}
