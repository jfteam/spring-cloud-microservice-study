package org.jfteam.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created with IntelliJ IDEA.
 * Description:通过@EnableTurbine接口，激活对Turbine的支持。
 * User: fengwenping
 * Date: 2017-07-16
 * Time: 下午4:16
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
    }
}