package com.DockerDemo.Dockerdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("send/{name}")
	public String sendMessage(@PathVariable String name) {
		
		return "Happy New Year "+name;
	}

}
