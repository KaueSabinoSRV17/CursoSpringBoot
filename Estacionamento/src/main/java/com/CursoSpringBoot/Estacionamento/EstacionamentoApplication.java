package com.CursoSpringBoot.Estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EstacionamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}
	
	@GetMapping("/")
	public String getIndex () {
		
		return "Olá Mundo!";
		
	}

}
