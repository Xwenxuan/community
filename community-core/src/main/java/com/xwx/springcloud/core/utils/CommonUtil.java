package com.xwx.springcloud.core.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * @author winsonxiao
 * @ClassName CommonUtil
 * @date 2021/10/11、9:02 下午
 */
public class CommonUtil {

    /**
     * 生成随机字符串
     * @return
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static String md5(String key) {
        if(StringUtils.isBlank(key)) {
            return null;
        }

        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
