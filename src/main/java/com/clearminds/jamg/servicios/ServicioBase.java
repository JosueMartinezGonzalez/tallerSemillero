package com.clearminds.jamg.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.jamg.bdd.ConexionBDD;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() {
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion() {
		if(conexion != null) {
			try {
				conexion.close();
				System.out.println("Conexión cerrada");			
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error al cerrar la conexión");
			}
		}

		
	}
}
