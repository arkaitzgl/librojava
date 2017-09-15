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
		 int cont =0;
		 FileReader fr=null;
		 BufferedReader br= null;
		
		
		try { 
			 fr = new FileReader("C:\\Desarrollo\\workspace\\JavaLibro\\data\\personas.txt");
			 br = new BufferedReader(fr);
		   
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
