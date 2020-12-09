package com.clearminds.jamg.servicios;

import com.clearminds.jamg.dtos.Estudiante;
import com.clearminds.jamg.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante " + estudiante);
		cerrarConexion();
	}
}
