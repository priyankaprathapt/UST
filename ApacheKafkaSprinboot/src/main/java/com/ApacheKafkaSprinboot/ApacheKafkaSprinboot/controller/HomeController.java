package com.ApacheKafkaSprinboot.ApacheKafkaSprinboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApacheKafkaSprinboot.ApacheKafkaSprinboot.service.Producer;

@RestController
@RequestMapping("api/kafka")
public class HomeController {
	
	private Producer kafkaProducer;
	
	@GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

}
