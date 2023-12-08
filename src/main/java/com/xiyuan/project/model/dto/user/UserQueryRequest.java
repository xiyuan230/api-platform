package com.xiyuan.project.model.dto.user;

import com.xiyuan.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户查询请求
 *

 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户角色：user / admin
     */
    private String userRole;


    private static final long serialVersionUID = 1L;
}