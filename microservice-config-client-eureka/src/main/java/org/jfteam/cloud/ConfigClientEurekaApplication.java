package org.jfteam.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-16
 * Time: 下午11:16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }
}
