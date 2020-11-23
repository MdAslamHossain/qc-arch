package com.kafka.root.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private final String TOPIC = "topic1";

	public void send(String message) {
		kafkaTemplate.send(TOPIC, message);
		System.out.println("Sending message is : " + message);
	}
}