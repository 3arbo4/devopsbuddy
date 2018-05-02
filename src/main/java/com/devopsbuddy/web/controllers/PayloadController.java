package com.devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayloadController {

	private static final Logger LOG = LoggerFactory.getLogger(PayloadController.class);
	public static final String PAYLOAD_VIEW_NAME = "payload/payload";
	
	@RequestMapping("/payload")
	public String payload() {
		return PAYLOAD_VIEW_NAME;
	}
}
