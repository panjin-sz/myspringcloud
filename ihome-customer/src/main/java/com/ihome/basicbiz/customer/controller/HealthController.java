package com.ihome.basicbiz.customer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/7/22.
 */
@RestController
@Slf4j
public class HealthController {

    @Value("${from}")
    private String from;

    @GetMapping(value = "/health")
    public String health() {
        log.info("--------------------info health-------------------");

        log.info("from is {}", from);
        return "hello, customer!";
    }
}
