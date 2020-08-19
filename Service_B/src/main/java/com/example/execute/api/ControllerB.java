package com.example.execute.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @Autowired
    MyFeignClientB myFeignClientB;

    @GetMapping("/nameB")
    public String getControllerName() {
        return "Name B From B Service IP Address: ";
    }

    @GetMapping("/getB")
    public String getBbb() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return "THIS IS SENT FROM B SERVICE";
    }


    @GetMapping("/callAFromB")
    public String communicate() {
        return myFeignClientB.getA();

    }


}


