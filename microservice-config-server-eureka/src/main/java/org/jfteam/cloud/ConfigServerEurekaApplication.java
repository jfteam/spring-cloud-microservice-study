package org.jfteam.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-16
 * Time: 下午11:08
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class, args);
    }
}