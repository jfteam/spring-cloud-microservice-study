package org.jfteam.cloud.web.controller;

import org.jfteam.cloud.service.RibbonHystrixService;
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
 * Time: 下午11:47
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("ribbons/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}
