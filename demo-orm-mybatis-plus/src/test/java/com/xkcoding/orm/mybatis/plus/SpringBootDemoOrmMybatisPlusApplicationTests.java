package com.xkcoding.orm.mybatis.plus;

import com.xkcoding.orm.mybatis.plus.entity.Role;
import com.xkcoding.orm.mybatis.plus.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoOrmMybatisPlusApplicationTests {

    @Autowired
    RoleService roleService;

    @Test
    public void contextLoads() {
        Role role = Role.builder().name("测试").build();
        roleService.testRole(role);
    }

    @Test
    public void contextLoads2() {
        Role role = Role.builder().name("测试").build();
        roleService.testRole2(role);
    }

    @Test
    public void contextLoads3() {
        Role role = Role.builder().name("测试").build();
        roleService.testRole3(role);
    }

}
