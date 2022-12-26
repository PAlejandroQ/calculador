package com.pipeline.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

//@SpringBootApplication
@Service
public class Calculador {
	public int sum(int a, int b) {
		return a + b;
	}

}
	public static void main(String[] args) {
		SpringApplication.run(Calculador.class, args);
	}

