package com.ulyne.consumer.controller;

import com.ulyne.consumer.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign 控制器
 * Created by fanwei_last on 2017/12/28.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
