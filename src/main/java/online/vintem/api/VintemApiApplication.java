package online.vintem.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import online.vintem.api.config.property.VintemApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(VintemApiProperty.class)
public class VintemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VintemApiApplication.class, args);
	}
}
