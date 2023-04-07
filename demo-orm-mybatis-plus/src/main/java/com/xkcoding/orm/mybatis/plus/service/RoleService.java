package com.xkcoding.orm.mybatis.plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xkcoding.orm.mybatis.plus.entity.Role;
import com.xkcoding.orm.mybatis.plus.entity.User;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 18:10
 */
public interface RoleService extends IService<Role> {
    void testRole(Role user);

    void testRole2(Role user);

    void testRole3(Role user);
}
