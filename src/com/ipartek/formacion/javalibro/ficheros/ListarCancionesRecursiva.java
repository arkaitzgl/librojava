package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarCancionesRecursiva {

	public static void listarDirectorio(File directorio, String separador) {
		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {
				listarDirectorio(ficheros[x], separador + separador);
			}
		}
	}

	public static void main(String[] args) {

		File f = new File("c:\\desarrollo\\Music");
		listarDirectorio(f, "----");
		/*
		 * System.out.println("Listado canciones");
		 * System.out.println("----------------------");
		 * 
		 * for (File c : carpetas) { File[] canciones = c.listFiles();
		 * System.out.println("[" + canciones.length + "] " + c.getName());
		 * 
		 * for (File cancion : canciones) { System.out.println("    " +
		 * cancion.getName() + " " + (cancion.length() / 1024) + " Kb"); } }
		 */

	}

}
