package com.xkcoding.zookeeper.service;

import com.xkcoding.zookeeper.annotation.ZooLock;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TestService {

    private static Integer total = 1000;

    @ZooLock(key = "buy", timeout = 1, timeUnit = TimeUnit.MINUTES)
    public void test(String id) throws InterruptedException {
        System.out.println("更新前。。。：" + total);
        TimeUnit.MILLISECONDS.sleep(30);
        total--;
        System.out.println("更新后。。。：" + total);
    }
}
