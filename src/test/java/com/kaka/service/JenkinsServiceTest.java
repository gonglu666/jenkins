package com.kaka.service;

import com.kaka.JenkinsApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Lu.Gong
 * @date 1/8/2020
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JenkinsApplication.class)
public class JenkinsServiceTest {

    @Autowired
    JenkinsService jenkinsService;

    @Test
    public void start() throws Exception {
        String serviceName = "Jenkins";
        String start = "The service "+serviceName + " is starting";;
        String start1 = jenkinsService.start(serviceName);
        Assert.assertEquals(start,start1);
    }

    @Test
    public void stop() throws Exception {
        String serviceName = "Jenkins";
        String stop = "The service "+serviceName + " is starting";;
        String stop1 = jenkinsService.start("test");
        Assert.assertEquals(stop,stop1);
    }

}