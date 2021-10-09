package com.xwx.springcloud.api.dto.req.base;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author winsonxiao
 * @ClassName BaseReqDto
 * @date 2021/10/9、9:18 下午
 */
@Data
public class BaseReqDto extends AbstractReqDto{
    private static final long serialVersionUID = 1L;

    public static <T> boolean isAllNull(T... args) {
        boolean allNull = true;
        if(null==args){
            return true;
        }
        for(T param : args){
            if(param != null){
                if(param instanceof List){
                    List list = List.class.cast(param);
                    if(!CollectionUtils.isEmpty(list)){
                        allNull = false;
                        break;
                    }
                }else{
                    allNull = false;
                    break;
                }
            }
        }
        return allNull;
    }

    public static <T> boolean isNotAllNull(T... args) {
        if(null==args){
            return false;
        }
        return !isAllNull(args);
    }
}
