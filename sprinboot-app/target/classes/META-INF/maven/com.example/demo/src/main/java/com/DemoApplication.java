package com;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class DemoApplication {

//	@GetMapping("/")
//	String home() {
//		return "Estoy en la raíz";
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}