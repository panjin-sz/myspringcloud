package com.ihome.basicbiz.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author panjin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class IhomeMerchantApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhomeMerchantApplication.class, args);
	}
}
