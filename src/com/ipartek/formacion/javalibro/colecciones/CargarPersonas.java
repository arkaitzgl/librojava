package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

/**
 * Cargamos en memoria los datos de las personas del fichero personas.txt<br>
 * La carga en memoria lo vamos a realizar con dos colecciones para ver cual es mas optima
 * Las coleeciones que vamos a usar son ArrayList<Persona> y HasMap<String, Persona>.<br>
 * @author Administrador
 *
 */

public class CargarPersonas {
	
	static final String PATH_FICHERO_PERSONAS = "data\\personas.txt";
	static final int NUM_CAMPOS_LINEA = 7;
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;
	
	static final String DNI_BUSCAR = "26779063W";


	public static void main(String[] args) throws PersonaException {
		
		cargaArrayList();
				
		
		cargaHahsMap();		

	}
	
	private static void cargaHahsMap() {
		HashMap<String,Persona> map = new HashMap<String,Persona>();
		FileReader fr = null;     
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] partes;
			while( (linea = br.readLine()) != null ) {
				
				partes = linea.split(",");
				if ( partes.length == NUM_CAMPOS_LINEA ) {
					try {
						p = mapeoLinea(partes);
						map.put(p.getDni(), p);
					}catch (Exception e) {
						//System.out.println("LINEA INCOORECTA: " + linea);
					}	
				}				
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y reader");
				e.printStackTrace();
			}
			
		}
				
		//recorrer de uno en uno para ver cuanto tarda el HashMap
		long inicio = System.currentTimeMillis();
		
		//uso de Iterator en lugar de for para mejorar eficiencia
		Collection colec = map.values();		
		Iterator<Persona> it = colec.iterator();
		Persona pIteracion = null;
		while( it.hasNext() ) {
			pIteracion = it.next();
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("HashMap Listar " + ( fin - inicio ) + " ms");
				
		//buscar
		inicio = System.currentTimeMillis();
		Persona pABuscar = map.get(DNI_BUSCAR);
		fin = System.currentTimeMillis();
		System.out.println("HashMap buscar dni " + ( fin - inicio ) + " ms");
		
	}

	private static void cargaArrayList() {
		ArrayList<Persona> lista = new ArrayList();
		FileReader fr = null;     
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] campos;
			while( (linea = br.readLine()) != null ) {
				
				campos = linea.split(",");
				if ( campos.length == NUM_CAMPOS_LINEA ) {
					try {
						p = mapeoLinea(campos);
						lista.add(p);
					}catch (Exception e) {
						//System.out.println("DATOS INCORRECTOS: " + linea);
					}	
				}				
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y reader");
				e.printStackTrace();
			}
			
		}
		
		
		//recorrer de uno en uno para ver cuanto tardacel ArrayList
		long inicio = System.currentTimeMillis();
		
		//uso de Iterator en lugar de for para mejorar eficiencia
		Iterator<Persona> it = lista.iterator();
		Persona pIteracion = null;
		while( it.hasNext() ) {
			pIteracion = it.next();
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("ArrayList Listar " + ( fin - inicio ) + " ms");
		
		
		//buscar
		inicio = System.currentTimeMillis();
		it = lista.iterator();
		pIteracion = null;
		while( it.hasNext() ) {
			pIteracion = it.next();
			if ( DNI_BUSCAR.equalsIgnoreCase(pIteracion.getDni())) {
				break;
			}
		}		
		fin = System.currentTimeMillis();
		System.out.println("ArrayList buscar dni " + ( fin - inicio ) + " ms");
		
		
	}

	
private static Persona mapeoLinea (String[] campos) throws NumberFormatException, PersonaException {
		
		Persona p = new Persona(    campos[CAMPOS_NOMBRE], 
									campos[CAMPOS_APE1], 
									campos[CAMPOS_APE2], 
									Integer.parseInt(campos[CAMPOS_EDAD]),
									campos[CAMPOS_MAIL], 
									campos[CAMPOS_DNI], 
									campos[CAMPOS_ROL]
									);	
		return p;
	}

}
