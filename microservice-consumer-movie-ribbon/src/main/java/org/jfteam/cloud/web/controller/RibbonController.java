package org.jfteam.cloud.web.controller;

import org.jfteam.cloud.service.RibbonService;
import org.jfteam.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: fengwenping
 * Date: 2017-07-11
 * Time: 上午12:15
 */
@RestController
@RequestMapping("ribbons")
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.ribbonService.findById(id);
    }
}
