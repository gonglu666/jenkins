package com.kaka.controllar;

import com.kaka.dto.PeopleRequest;
import com.kaka.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by kaonglu
 * 2020/1/7
 */
@RestController
public class JenkinsControllar {

    @Autowired
    JenkinsService jenkinsService;

    @RequestMapping(value = "/api/operation",method = RequestMethod.GET)
    public String doOperation(@RequestParam String name) {
        return jenkinsService.start(name);
//        return jenkinsService.stop(name);
    }
}
