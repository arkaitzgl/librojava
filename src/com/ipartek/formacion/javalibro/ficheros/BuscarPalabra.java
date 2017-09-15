package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma recursiva los ficheros,
 * hasta encontrar dentro de un .txt la palabra "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 *
 */

public class BuscarPalabra {
	
	
	public static void buscardato(File f, String palabra) {
		
		//recursos para lectura de ficheros de caracteres
				FileReader fr = null;
				BufferedReader br = null;
				
				File[] ficheros = f.listFiles();

				for (File fichero : ficheros) {

					if (fichero.isDirectory()) {           // es un directorio
						buscardato(fichero, palabra);
					} else {                               // es un fichero

						//buscar palabra
						try {
							fr = new FileReader(fichero);
							br = new BufferedReader(fr);
							String linea = "";
							//leer linea a linea todo el fichero de texto
							while ((linea = br.readLine()) != null) {
								if (linea.indexOf(palabra) != -1) {
									System.out.println("Hemos encontrado la palabra " + palabra + " en fichero " + fichero);
								}
							}

						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							try {
								br.close();
								fr.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}// finally
						
					}//end else
				}// enf for ficheros
			}//buscarpalabra
	public static void main(String[] args) {
		
		
		File f = new File("C:\\buscatesoro");
		buscardato(f, "osobuko");

	}

}
