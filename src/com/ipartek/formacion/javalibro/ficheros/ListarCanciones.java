package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/**
 * Listar todas las canciones de la carpeta c:desarrollo/Music
 * 
 * @author Administrador
 *
 */
public class ListarCanciones {

	public static void main(String[] args) {

		long tamaño = 0;
		File musica = new File("C:\\Desarrollo\\Music");
		if (musica.isDirectory()) {
			File[] carpeta = musica.listFiles();
			for (int i = 0; i < carpeta.length; i++) {
				System.out.println(carpeta[i]);
				if (carpeta[i].isDirectory()) {
					String[] canciones = carpeta[i].list();
					for (int j = 0; j < canciones.length; j++) {
						tamaño = (canciones[j].length() / 1024);
						System.out.println(canciones[j] + " y su tamaño es: " + tamaño + "Kb");
					} // end for listar fichero

				} // end if segunda comprobacion isdirectory

			} // end for listar directorios

		} // end if isdirectoy

	}
}
