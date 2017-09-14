package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 *
 */

public class CrearFicheroYdirectorio {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);
		String directorio;
		String fichero;
		String contenido;

		try {
			System.out.println("Introduce nombre del directorio: ");
			directorio=sc.nextLine();
			
			File carpeta=new File("c:\\"+directorio); 
			carpeta.mkdir(); 
			
			System.out.println("Introduce nombre del fichero: ");
			fichero=sc.nextLine();
			
			
			
			fw = new FileWriter(carpeta+"\\"+fichero+".txt");
			bw = new BufferedWriter(fw);
			
			System.out.println("Introduce texto: ");
			contenido=sc.nextLine();
			bw.write(contenido);

			System.out.println("Fichero creado con exito");
			

		} catch (IOException e) {
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {

			try {
				sc.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y Writer");
				e.printStackTrace();
			}
		}

	}

}
