package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/api")
	public void meassage() throws CustomeException {
		throw new CustomeException();
	}

}
