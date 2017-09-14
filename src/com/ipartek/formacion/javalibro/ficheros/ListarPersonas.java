package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer linea a linea el fichero "data/personas.txt" y mostrar por pantalla.<br>
 * Contar el total de personas leidas.
 * 
 *
 */

public class ListarPersonas {

	public static void main(String[] args) {
	
		try { 
			FileReader fr = new FileReader("C:\\desarrollo\\data\\personas.txt");
		    BufferedReader br = new BufferedReader(fr);
		    int cont =0;
			String linea=null; 
			while ((linea=br.readLine()) != null) { 
				System.out.println(linea); 
				cont++;
				} 
				System.out.println("El numero total de personas es: "+cont);
				br.close(); 
				} catch (IOException errorDeFichero) 
		{ System.out.println( "Ha habido problemas: " + errorDeFichero.getMessage() );
		}

	}

}
