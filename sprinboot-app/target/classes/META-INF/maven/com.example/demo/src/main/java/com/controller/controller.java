package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.DatosGuau;
import com.model.DatosInicio;
import com.service.PruebaImpl;


@RestController
public class controller {
	
	@GetMapping("/api/inicio")
	public DatosInicio prueba() {

		DatosInicio salida = new DatosInicio();
		PruebaImpl prueba = new PruebaImpl();
		try {
			salida = prueba.inicio();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return salida;
		
	}
	
	@GetMapping("/api/guau")
	public DatosGuau guauController() {
		
		DatosGuau salida = new DatosGuau();
		PruebaImpl prueba = new PruebaImpl();
		
		try {
			salida = prueba.guau();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return salida;
		
	}
	
	@GetMapping("/prueba")
	String home2() {
		return "Prueba";
	}
	

}
