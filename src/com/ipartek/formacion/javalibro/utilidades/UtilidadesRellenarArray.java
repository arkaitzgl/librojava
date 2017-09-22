package com.ipartek.formacion.javalibro.utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;


/**
 * Clase que se utilizará para extraer los datos de un fichero y comprobar que sus datos son 
 * correctos
 * @author Administrador
 *
 */
public class UtilidadesRellenarArray {

	// Variable que usaremos para controlar el que el numero de campos por linea sea 7
	static final int NUM_CAMPOS_LINEA = 7;
	
	//Variables que usaremos para indicar las posiciones en el array
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	
	/**
	 * Método de tipo ArrayList casteado a Persona, al que se le pasará el fichero a comprobar y nos devolverá los datos a "lista"
	 * @param PATH_FICHERO el fichero del que obtendremos los datos
	 * @return lista array con todos los campos correctos
	 */
	public static ArrayList<Persona> rellenarArrayList(String PATH_FICHERO) {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		FileReader fr = null;
		BufferedReader br = null;
		String msg;
		try {

			fr = new FileReader(PATH_FICHERO);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] partes;
			while ((linea = br.readLine()) != null) {

				partes = linea.split(",");
				if (partes.length == NUM_CAMPOS_LINEA) {       // Comprobamos que al dividir cada linea esten compuestas por 7 campos
					try {
						p = mapeoLinea(partes);
						lista.add(p);
					} catch (PersonaException e) {
						msg = e.getMessage();
					}
				} // end if
			} // end while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				msg = "No se puede cerrar el Buffer y reader";
				e.printStackTrace();
			}
		} // end finally
		return lista;
	}
/**
 * Método de tipo Persona con el que iremos rellenando los campos con los datos válidos
 * @param campos array de tipo string al que pasaremos las partes en la que dividamos las lineas validas 
 * @return p objeto de tipo persona 
 * @throws NumberFormatException
 * @throws PersonaException excepcion personalizada que nos comprobará que los campos sean correctos
 */
	public static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2],
				Integer.parseInt(campos[CAMPOS_EDAD]), campos[CAMPOS_MAIL], campos[CAMPOS_DNI], campos[CAMPOS_ROL]);
		return p;
	}

}
