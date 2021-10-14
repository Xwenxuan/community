package com.xwx.springcloud.core.model.bo.user;

import lombok.Data;

/**
 * @author winsonxiao
 * @ClassName InsertUserBo
 * @date 2021/10/11、9:16 下午
 */

@Data
public class InsertUserBo {
    private String username;

    private String email;

    private String password;
}
