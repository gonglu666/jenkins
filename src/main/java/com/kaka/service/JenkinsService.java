package com.kaka.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author Lu.Gong
 * @date 1/8/2020
 */
@Service
public class JenkinsService {


    public String start(String serviceName) {
        if(StringUtils.isEmpty(serviceName)) {
            throw new RuntimeException("the service name is null");
        }
        return "The service "+serviceName + " is starting";
    }

    public String stop(String serviceName) {
        if(StringUtils.isEmpty(serviceName)) {
            throw new RuntimeException("the service name is null");
        }
        return  "The service "+serviceName +" is stoping";
    }
}
