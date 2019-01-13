package com.ihome.basicbiz.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author panjin
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ihome.basicbiz.customer.mapper")
public class IhomeCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhomeCustomerApplication.class, args);
	}
}
