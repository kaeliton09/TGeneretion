package dev.k4eliton.TGeneretion;

import dev.k4eliton.TGeneretion.model.PlayerModel;
import dev.k4eliton.TGeneretion.respository.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TGeneretionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TGeneretionApplication.class, args);
	}
}
