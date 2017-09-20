package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 * Nos conectaremos una pagina web http://www.example.com/ para descargar codigo
 * fuente
 *
 */

public class ConectarPaginaWeb {

	public static void main(String[] args) {

		final String PAGINA_WEB = "http://www.example.com/";

		try {

			// creamos URL
			URL url = new URL(PAGINA_WEB);

			// abrimos conexion
			URLConnection con = url.openConnection();

			// crear inputstream y buffer asociado
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			// leemos codigo fuente
			String linea = "";
			String[] enlace = null;
			String nuevaUrl = null;
			while ((linea = br.readLine()) != null) {
				// toda la pagina
				// System.out.println(linea);

				/*
				 * conseguir h1
				 * 
				 * if (linea.indexOf("<h1>")!=-1) { System.out.println(linea); }
				 */
				// Conseguir enlace de la pagiina y sacar el codigo fuente
				if (linea.indexOf("href") != -1) {
					System.out.println(linea);
					enlace = linea.split("\"");
					System.out.println(enlace[1]);
					nuevaUrl = enlace[1];
				}

			}

			// creamos URL
			URL url2 = new URL(nuevaUrl);

			// abrimos conexion
			URLConnection con2 = url2.openConnection();

			// crear inputstream y buffer asociado
			InputStreamReader isr2 = new InputStreamReader(con2.getInputStream());
			BufferedReader br2 = new BufferedReader(isr2);

			// leemos codigo fuente
			String linea2 = "";
			while ((linea2 = br2.readLine()) != null) {
				System.out.println(linea2);
			}

		} catch (MalformedURLException e) {
			System.out.println("URL mal escrita " + PAGINA_WEB);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No podemos establecer conexion");
			e.printStackTrace();
		}

	}

}
