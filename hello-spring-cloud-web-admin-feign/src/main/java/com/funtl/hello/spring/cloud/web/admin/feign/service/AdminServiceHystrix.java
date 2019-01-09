package com.funtl.hello.spring.cloud.web.admin.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author Mr.Huang
 * @create 2019-01-09 18:53
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
