package org.jfteam.cloud.client;

import org.jfteam.cloud.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 * Description: 使用@FeignClient注解的fallback属性，指定fallback类
 * User: fengwenping
 * Date: 2017-07-11
 * Time: 下午10:40
 */
@FeignClient(name = "microservice-provider-user", fallback = UserFeignHystrixClient.HystrixClientFallback.class)
public interface UserFeignHystrixClient {

    @GetMapping("users/{id}")
    User findByIdFeign(@PathVariable("id") Long id);


    @Component
    class HystrixClientFallback implements UserFeignHystrixClient {

        private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

        @Override
        public User findByIdFeign(@PathVariable("id") Long id) {
            LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
            User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge(0);
            return user;
        }
    }
}
