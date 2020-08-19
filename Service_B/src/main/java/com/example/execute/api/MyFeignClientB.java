package com.example.execute.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "A-SERVICE")
public interface MyFeignClientB {

    @GetMapping(value = "getA")
    String getA();

}
