package com.clearminds.jamg.bdd.test;

import java.sql.Connection;

import com.clearminds.jamg.bdd.ConexionBDD;

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
