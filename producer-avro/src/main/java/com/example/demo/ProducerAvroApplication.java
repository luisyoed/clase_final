package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ProducerAvroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerAvroApplication.class, args);
	}

}
