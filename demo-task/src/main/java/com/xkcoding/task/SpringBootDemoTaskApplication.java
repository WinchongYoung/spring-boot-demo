package com.xkcoding.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-22 19:00
 */
@SpringBootApplication
public class SpringBootDemoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTaskApplication.class, args);
    }
}

/**
 * 任务类上加Component注解，任务调度方法上加Scheduled注解
 */
