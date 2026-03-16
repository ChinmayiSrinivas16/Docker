package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name="server",configuration = RibbonConfiguration.class)
public class AmazonPortalApplication {
	public static void main(String[] args) {
		SpringApplication.run(AmazonPortalApplication.class, args);
	}

}
