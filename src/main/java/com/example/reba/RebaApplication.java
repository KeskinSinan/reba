package com.example.reba;

import com.example.reba.configuration.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JpaConfig.class)
public class RebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RebaApplication.class, args);
	}

}
