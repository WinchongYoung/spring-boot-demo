package com.xkcoding.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.orm.mybatis.plus.entity.Role;
import com.xkcoding.orm.mybatis.plus.mapper.RoleMapper;
import com.xkcoding.orm.mybatis.plus.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 18:10
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    // Transactional注解测试
    // 结论:底层分别计算抛出异常与rollbackFor、noRollbackFor父子间距离
    // 以距离最近的异常参数的回滚类型进行回滚
    // 例如：
    // depth = (RuntimeException, Exception)        = 1
    // depth = (RuntimeException, RuntimeException) = 0
    // 所以RuntimeException异常的回滚类型noRollback进行回滚
    @Override
    @Transactional(rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
    // 事务不回滚
    public void testRole(Role user) {
        this.save(user);
        throw new RuntimeException();
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class, noRollbackFor = Exception.class)
    // 事务回滚
    public void testRole2(Role user) {
        this.save(user);
        throw new RuntimeException();
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class, noRollbackFor = Exception.class)
    // 事务回滚
    public void testRole3(Role user) {
        this.save(user);
        throw new NullPointerException();
    }
}
