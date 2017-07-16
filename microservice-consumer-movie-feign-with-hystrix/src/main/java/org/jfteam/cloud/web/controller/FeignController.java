package org.jfteam.cloud.web.controller;

import org.jfteam.cloud.client.UserFeignHystrixClient;
import org.jfteam.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-11
 * Time: 下午10:42
 */
@RestController
public class FeignController {

    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable("id") Long id){
        User user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }
}
