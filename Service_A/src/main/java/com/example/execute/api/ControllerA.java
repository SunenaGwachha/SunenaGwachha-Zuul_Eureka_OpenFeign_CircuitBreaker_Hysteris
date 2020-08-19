package com.example.execute.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class ControllerA {

    @Autowired
    MyFeignClientA myFeignClientA;

    @GetMapping("/nameA")
    public String getControllerName() {
        return "Name A From A Service IP Address: ";
    }

    @GetMapping("/getA")
    public String getAaa() {
        return "THIS IS SENT FROM A SERVICE";
    }

    @GetMapping("/callBFromA")
//	@HystrixCommand(fallbackMethod = "serviceMayBeDown") // This is usually used in service class OR used where
    // restTemplate is used to communicate with another
    // micro-service

    @HystrixCommand(fallbackMethod = "serviceMayBeDown", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    public String communicate() {

        return myFeignClientA.getB();
    }

    public String serviceMayBeDown() {

        return "Requested B Service May be down or too busy";
    }

//    @GetMapping("/callB1FromA")
//    public String communicate() {
//
//        return myFeignClientA.getB1();
//    }
//
//
//    @GetMapping("/callB2FromA")
//    public String communicate() {
//
//        return myFeignClientA.getB2();
//    }
}