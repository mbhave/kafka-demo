package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Madhura Bhave
 */
@SpringBootApplication
@EnableKafka
@EnableScheduling
public class ApacheKafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaDemoApplication.class);
	}

}
