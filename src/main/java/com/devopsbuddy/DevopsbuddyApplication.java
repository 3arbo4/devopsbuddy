package com.devopsbuddy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsbuddyApplication {

	private static final Logger LOG = LoggerFactory.getLogger(DevopsbuddyApplication.class);
	
	public static void main(String[] args) {
		String userHome = "user.home";

        // We get the path by getting the system property with the 
        // defined key above.
        String path = System.getProperty(userHome);

        // We print your home path here
        System.out.println("Your Home Path: " + path);

        SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}