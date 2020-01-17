package com.kaka.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Lu.Gong
 * @date 1/8/2020
 */
@Service
public class JenkinsService {


    private ExecutorService executorService =new ThreadPoolExecutor(10, 10,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    public String start(String serviceName) {
        if(StringUtils.isEmpty(serviceName)) {
            throw new RuntimeException("the service name is null");
        }
        for( int  i=0;i<10;i++) {

            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                        while(true) {
                            System.out.println(Thread.currentThread().getName()+"--"+finalI+" is running");

                        }
                }
            });
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
