package com.ihome.basicbiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author panjin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class IhomeCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhomeCustomerApplication.class, args);
	}
}
