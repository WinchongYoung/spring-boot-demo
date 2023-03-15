package com.xkcoding.cache.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-16 17:02
 */
@SpringBootApplication
@EnableCaching
public class SpringBootDemoCacheEhcacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoCacheEhcacheApplication.class, args);
    }
}

/**
 * ehcache数据缓存在JVM中
 * 使用步骤：
 * 1、在Application启动类添加EnableCaching注解
 * 2、配置ehcache.xml文件，并在application.yml中引入
 * 3、使用，常用操作
 * CachePut   新增
 * Cacheable  获取
 * CacheEvict 删除
 */
