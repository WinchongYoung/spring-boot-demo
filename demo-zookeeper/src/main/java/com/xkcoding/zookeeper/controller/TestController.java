package com.xkcoding.zookeeper.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.zookeeper.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 消息发送Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-18 19:50
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Autowired
    private TestService service;

    @PostMapping("/test")
    public Dict test(@RequestBody String id) throws InterruptedException {
        service.test(id);
        return Dict.create().set("flag", true).set("code", 200).set("message", "发送成功");
    }

}
