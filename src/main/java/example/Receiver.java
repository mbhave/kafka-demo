package example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Madhura Bhave
 */
@Component
public class Receiver {

	@KafkaListener(topics = "string-topic")
	public void consume(String message) {
		System.out.println("Received: " + message);
	}

}
