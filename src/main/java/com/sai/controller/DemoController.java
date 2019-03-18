package com.sai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.model.DemoModel;

@RestController
public class DemoController {

	Logger logger = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/hi")
	public String sayHi() {

		return "Hello";
	}

	@PostMapping("/show")
	public String showData(@RequestBody DemoModel demoModel) {
		try {
			logger.info(demoModel.getEmail());
			throw new Exception("Intentionally throwing......");
		} catch (Exception e) {
			logger.error("----"+e.getMessage());
		}
		return demoModel.toString();
	}

}
