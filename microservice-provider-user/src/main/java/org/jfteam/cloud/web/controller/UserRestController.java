package org.jfteam.cloud.web.controller;

import org.jfteam.cloud.repository.UserRepository;
import org.jfteam.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-10
 * Time: 下午11:31
 */
@RestController
@RequestMapping("users")
public class UserRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable("id") Long id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
}
