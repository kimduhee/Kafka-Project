package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics="test", groupId="group-id-test")
	public void consumer(String message) throws Exception {
		System.out.println("message: " + message);
	}
}
