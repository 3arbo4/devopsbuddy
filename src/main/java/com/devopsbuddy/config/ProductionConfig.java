package com.devopsbuddy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.SmtpEmailService;


@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}\\work\\practice\\config\\devopsbuddy\\application-prod.properties")
//@PropertySource("file:///C:\\Users\\lyn22_000\\work\\practice\\devopsbuddy\\application-prod.properties")
public class ProductionConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductionConfig.class);
	
	@Bean
	public EmailService emailService() {
		LOG.debug("using SMTP email service");
		return new SmtpEmailService();
	}
}
