package com.clearminds.jamg.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
}
