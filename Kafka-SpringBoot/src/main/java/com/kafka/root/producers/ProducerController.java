package com.kafka.root.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	@Autowired
	private Producer producer;

	@RequestMapping(value = "/message/{message}")
	public void writeMessageToTopic(@PathVariable String message) {
		producer.send(message);
	}
}
