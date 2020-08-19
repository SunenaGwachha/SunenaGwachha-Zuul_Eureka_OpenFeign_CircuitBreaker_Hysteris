package com.example.execute.api;

import com.netflix.appinfo.AmazonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ServiceBApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }

}
