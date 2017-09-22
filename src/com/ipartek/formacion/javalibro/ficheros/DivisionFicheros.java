package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;
import com.ipartek.formacion.javalibro.utilidades.UtilidadesRellenarArray;

public class DivisionFicheros {

	// Variables con la posicion de los ficheros
	static final String PATH_FICHERO_PERSONAS = "data\\personas.txt";
	static final String PATH_FICHERO_PERSONAS_OK = "data\\personasOK.txt";
	static final String PATH_FICHERO_PERSONAS_ERROR = "data\\personasError.txt";

	static final int NUM_CAMPOS_LINEA = 7;
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		// Variable para el fichero con los datos correctos
		FileWriter fw = null;
		BufferedWriter bw = null;

		// Variables para el fichero con los datos incorrectos
		FileWriter fw2 = null;
		BufferedWriter bw2 = null;

		try {
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			fw = new FileWriter(PATH_FICHERO_PERSONAS_OK);
			bw = new BufferedWriter(fw);
			fw2 = new FileWriter(PATH_FICHERO_PERSONAS_ERROR);
			bw2 = new BufferedWriter(fw2);
			String[] partes;
			String linea = null;
			Persona p = null;
			
			while ((linea = br.readLine()) != null) {

				partes = linea.split(",");
				try {
					if (partes.length == NUM_CAMPOS_LINEA) {
						p = UtilidadesRellenarArray.mapeoLinea(partes);
						bw.write(linea + "\r\n");
						bw.flush();
					} else {
						bw2.write(linea + "\r\n");
						bw2.flush();
					}

				} catch (PersonaException e) {
					bw2.write(linea + "\r\n");
					bw2.flush();
				}

			} // end while

		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		} finally {
			try {
				bw.close();
				bw2.close();
				fw.close();
				fw2.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer ,writer, reader");
				e.printStackTrace();
			}

		}

	}

}
