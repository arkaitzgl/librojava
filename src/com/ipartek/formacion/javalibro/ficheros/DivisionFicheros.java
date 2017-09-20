package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class DivisionFicheros {
	
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

		ArrayList<Persona> lista = new ArrayList();
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
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
						p = mapeoLinea(partes);
						bw.write(linea + "\r\n");
					} else {
						bw2.write(linea + "\r\n");
					}

				} catch (Exception e) {
					bw2.write(linea + "\r\n");
				}

			}
			bw.close();
			bw2.close();
			fw.close();
			fw2.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}

	}

	private static Persona mapeoLinea(String[] campos) throws PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2],
				Integer.parseInt(campos[CAMPOS_EDAD]), campos[CAMPOS_MAIL], campos[CAMPOS_DNI], campos[CAMPOS_ROL]);
		return p;
	}
}
