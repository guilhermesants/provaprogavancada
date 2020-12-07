package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.controller"})
@EntityScan({"com.example.domain"})
public class AvaliacaoProgAvancadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoProgAvancadaApplication.class, args);
	}

}
