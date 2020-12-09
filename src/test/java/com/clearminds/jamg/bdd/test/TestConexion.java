package com.clearminds.jamg.bdd.test;

import java.sql.Connection;

import com.clearminds.jamg.bdd.ConexionBDD;
import com.clearminds.jamg.dtos.Estudiante;
import com.clearminds.jamg.excepciones.BDDException;
import com.clearminds.jamg.servicios.ServicioEstudiante;

public class TestConexion {

	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion != null) {
				System.out.println("Conexión exitosa!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
