package com.ihome.basicbiz.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
