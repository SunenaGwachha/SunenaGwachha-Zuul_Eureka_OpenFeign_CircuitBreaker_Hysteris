package com.example.execute.api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "B-SERVICE")
public interface MyFeignClientA {

    @GetMapping(value = "getB")
    String getB();

//    @GetMapping(value = "getB1")
//    String getB1();
//
//    @GetMapping(value = "getB2")
//    String getB2();


}

