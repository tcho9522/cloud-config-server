package com.trilogyed.cloudconfigservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigService1Application.class, args);
	}

}
