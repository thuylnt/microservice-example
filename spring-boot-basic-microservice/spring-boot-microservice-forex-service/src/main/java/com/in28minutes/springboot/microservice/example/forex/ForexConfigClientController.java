package com.in28minutes.springboot.microservice.example.forex;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ForexConfigClientController {

    @Value("${serviceA.address}")
    private String serviceAddress;

    @Value("${serviceA.ip}")
    private String serviceIp;


    @RequestMapping("/showConfig")
    @ResponseBody
    public String showConfig() {
        String configInfo = "serviceA.address=" + serviceAddress
                + "<br/>serviceA.ip=" + serviceIp;

        return configInfo;
    }
}