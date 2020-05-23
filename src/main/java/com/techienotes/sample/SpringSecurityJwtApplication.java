package com.techienotes.sample;

import com.techienotes.sample.configs.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJwtApplication implements CommandLineRunner {

	@Autowired
	private ApplicationConfig myConfig;

	public static void main(String[] args) {
//		SpringApplication.run(SpringSecurityJwtApplication.class, args);
		SpringApplication app = new SpringApplication(SpringSecurityJwtApplication.class);
		app.run();
	}

	public void run(String... args) throws Exception {
		System.out.println("using environment: " + myConfig.getEnvironment());
		System.out.println("name: " + myConfig.getName());
		System.out.println("servers: " + myConfig.getServers());
	}
}

