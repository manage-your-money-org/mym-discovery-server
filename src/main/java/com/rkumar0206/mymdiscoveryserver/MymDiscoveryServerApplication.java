package com.rkumar0206.mymdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MymDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymDiscoveryServerApplication.class, args);
	}

}
