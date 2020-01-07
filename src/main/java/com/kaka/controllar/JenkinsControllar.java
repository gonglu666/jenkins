package com.kaka.controllar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaonglu
 * 2020/1/7
 */
@RestController
public class JenkinsControllar {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
