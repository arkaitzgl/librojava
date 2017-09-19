package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Cargamos en memoria los datos de las personas del fichero personas.txt<br>
 * La carga en memoria lo vamos a realizar con dos colecciones para ver cual es mas optima
 * Las coleeciones que vamos a usar son ArrayList<Persona> y HasMap<String, Persona>.<br>
 * @author Administrador
 *
 */

public class CargarPersonas {

	static ArrayList<Persona> p = new ArrayList<>();
	static HashMap<String, Persona> map = new HashMap<String, Persona>();

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:\\Desarrollo\\workspace\\JavaLibro\\data\\personas.txt");
			br = new BufferedReader(fr);
			String[] partes;
			String linea = null;

			while ((linea = br.readLine()) != null) {
				partes = linea.split(",");

				if (partes.length == 7) {

					String nombre = partes[0];
					String apellido1 = partes[1];
					String apellido2 = partes[2];
					String num = partes[3];
					String mail = partes[4];
					String dni = partes[5];
					String funcion = partes[6];

					Persona personas = new Persona(nombre, apellido1, apellido2, num, mail, dni, funcion);
					p.add(personas);
					map.put(dni, personas);
				}

			}
			long tInicioArray = System.currentTimeMillis();
			for (Persona person : p) {

			}
			long tFinArray = System.currentTimeMillis();

			System.out.println("Tiempo de ejecutar ArrayList " + (tFinArray - tInicioArray) + " ms");

			long tInicio = System.currentTimeMillis();
			map.values();
			long tFin = System.currentTimeMillis();

			System.out.println("Tiempo de ejecutar hasmap " + (tFin - tInicio) + " ms");

			int contArray = 0;
			for (Persona person : p) {
				if (("26779063W").equals(person.getDni())) {
					System.out.println("Se encuentra en la linea " + contArray);
				}
				contArray++;
			}
			

			br.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}

	}

}
