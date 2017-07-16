package org.jfteam.cloud.service;

import org.jfteam.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-11
 * Time: 上午12:10
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        String url = "http://microservice-provider-user/users/";
        return this.restTemplate.getForObject(url + id, User.class);
    }
}
