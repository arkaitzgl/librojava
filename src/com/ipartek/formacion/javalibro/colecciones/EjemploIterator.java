package com.ipartek.formacion.javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {

		long tInicio = System.currentTimeMillis(); 
		HashSet<String> listaNombres = new HashSet<>();
		listaNombres.add("Manolo");
		listaNombres.add("Manola");
		listaNombres.add("Manolito");
		listaNombres.add("Manolita");
		listaNombres.add("Manuel");
		
		
		//Iterator es mas optimo para recorrer colecciones que un for
		Iterator <String> it=listaNombres.iterator();
		String nombre = "";
		while (it.hasNext()) {
			nombre = it.next();
			System.out.println(nombre);
			
		}
		long tFin = System.currentTimeMillis(); 
		
		System.out.println("Tiempo de ejecutar" + (tFin-tInicio)+ " ms");

	}

}
