package com.xiyuan.project.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户注册请求体
 *

 */
@Data
public class UserRegisterRequest implements Serializable {


    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private static final long serialVersionUID = 1L;
}
