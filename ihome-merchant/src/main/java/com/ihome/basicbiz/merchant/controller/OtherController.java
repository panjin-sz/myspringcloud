package com.ihome.basicbiz.merchant.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/8/27.
 */
@RestController
@Slf4j
public class OtherController {

    @Value("${from}")
    private String from;

    @GetMapping(value = "/other")
    public String health() {
        log.info("--------------------info other-------------------");

        from += "9";
        log.info("from is {}", from);
        return "hello, other merchant!";
    }
}
