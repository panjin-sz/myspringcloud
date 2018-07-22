package com.ihome.platform.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/7/22.
 */
@Slf4j
@RestController
public class HealthController {

    @GetMapping(value = "/health")
    public String health() {
        log.info("--------------------info health-------------------");

        return "hello, zuul!";
    }
}
