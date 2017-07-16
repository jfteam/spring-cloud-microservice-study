package org.jfteam.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.jfteam.cloud.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-11
 * Time: 下午11:35
 */
@Service
public class RibbonHystrixService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用@HystrixCommand注解指定该方法发生异常时调用的方法
     *
     * @param id
     * @return 通过id查询到的用户
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        String url = "http://microservice-provider-user/users/";
        return this.restTemplate.getForObject(url + id, User.class);
    }

    /**
     * hystrix fallback方法
     *
     * @param id
     * @return 默认的用户
     */
    public User fallback(Long id) {
        LOGGER.info("异常发生,进入fallback方法,接收的参数:id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
