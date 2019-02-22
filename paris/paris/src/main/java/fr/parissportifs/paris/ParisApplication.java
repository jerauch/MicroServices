package fr.parissportifs.paris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ParisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParisApplication.class, args);
	}
}
