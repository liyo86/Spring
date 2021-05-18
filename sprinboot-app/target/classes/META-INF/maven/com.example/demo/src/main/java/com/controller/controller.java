package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Prueba;
import com.service.PruebaImpl;

@RestController
public class controller {
	
	@GetMapping("/inicio")
	public String prueba() {
		
		Prueba prueba = new PruebaImpl();
		String salida = "";
		try {
			salida = prueba.inicio();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return salida;
		
	}
	
	@GetMapping("/")
	String home() {
		return "Estoy en la raíz";
	}
	
	@GetMapping("/prueba")
	String home2() {
		return "Prueba";
	}
	

}
