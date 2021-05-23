package com.service;

import com.model.DatosGuau;
import com.model.DatosInicio;

public class PruebaImpl implements Prueba{

	@Override
	public DatosInicio inicio() {
		
		DatosInicio dato = new  DatosInicio();
		dato.setNombre("YUPI");
		dato.setStatus("OK");
		return dato;
	}

	@Override
	public DatosGuau guau() {
		// TODO Auto-generated method stub
		DatosGuau datosGuau = new DatosGuau();
		datosGuau.setDato("Wuauuuuuuu");
		datosGuau.setStatus("OK");
		return datosGuau;
	}

}
