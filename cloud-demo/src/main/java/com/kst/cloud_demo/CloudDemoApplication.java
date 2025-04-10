package com.kst.cloud_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudDemoApplication.class, args);
	}
}
