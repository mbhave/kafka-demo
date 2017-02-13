package example;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Madhura Bhave
 */
@Component
public class Sender {

	private AtomicInteger count = new AtomicInteger();

	private final KafkaTemplate<String, Integer> template;

	public Sender(KafkaTemplate<String, Integer> template) {
		this.template = template;
	}

	@Scheduled(fixedRate = 1000)
	public void sendMessage() {
		template.send("int-topic", count.getAndIncrement());
	}

}
