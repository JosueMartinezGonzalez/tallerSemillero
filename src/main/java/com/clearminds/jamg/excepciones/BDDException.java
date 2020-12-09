package com.clearminds.jamg.excepciones;

public class BDDException extends Exception {

	public BDDException(String mensaje) {
		super(mensaje+"No se pudo conectar a la base de datos");
	}
}
