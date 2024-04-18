package com.demo.microservices.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/*
 * Earlier versions of spring-cloud - load balancer was Ribbon and shifted to
 * 		spring-cloud-starter-loadbalancer used by Eureka client for load balancing
 * 
 */

@EnableEurekaServer
@SpringBootApplication
public class NamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerApplication.class, args);
	}

}
