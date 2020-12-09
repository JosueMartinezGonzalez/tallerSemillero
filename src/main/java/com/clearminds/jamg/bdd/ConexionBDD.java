package com.clearminds.jamg.bdd;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBDD {

	public static String leerPropiedad(String nomprepro) {
		Properties p = new Properties();
		if (p != null) {
			try {
				p.load(new FileReader("C:\\Users\\PC\\Desktop\\clone_repo\\tallerSemillero\\conexion.properties"));
			} catch (Exception e) {
				return null;
			}			
		}
		return p.getProperty(nomprepro);
	}
	
	public static Connection obtenerConexion () {
		String usuario = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		Connection con = null;
		try {
			 con = DriverManager.getConnection(url+";user="+usuario+";password="+password+";");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
