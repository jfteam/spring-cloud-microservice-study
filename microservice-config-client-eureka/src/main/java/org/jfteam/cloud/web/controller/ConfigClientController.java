package org.jfteam.cloud.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description: 这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * User: fengwenping
 * Date: 2017-07-16
 * Time: 下午11:17
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
