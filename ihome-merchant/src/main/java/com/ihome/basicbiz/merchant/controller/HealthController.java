package com.ihome.basicbiz.merchant.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/8/5.
 */
@RestController
@Slf4j
public class HealthController {

    @GetMapping(value = "/health")
    public String health() {
        log.info("--------------------info health-------------------");
        return "hello, merchant!";
    }
}
