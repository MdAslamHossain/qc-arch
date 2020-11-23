package com.kafka.root.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	private final String TOPIC = "topic1";
    // group id is anything
	@KafkaListener(topics = TOPIC, groupId = "my-group-id")
	public void receive(String message) {
		System.out.println("Received message is : " + message);
	}

}