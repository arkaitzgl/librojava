package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.Participante;

/**
 * Creamos una Lista para contener objetos de las Clases Participante y libro
 * @author Administrador
 *
 */
public class ListaInterfaz {

	public static void main(String[] args) throws ParticipanteException {

		ArrayList <Imprimible> lista = new ArrayList <Imprimible>();
		
		
		//Creamos objetos de diferentes clases
		Libro l = new Libro ("100 años de soledad");
		Libro l2= new Libro("Años salvajes");
		
		Participante p= new Participante ("William", 50);
		
		//Añadir en lista
		lista.add(l);
		lista.add(l2);
		lista.add(p);
		
		//recorrer lista y mostrar
		
		for (Imprimible elem : lista) {
			if (elem instanceof Libro) {
				Libro libro= (Libro) elem;
				System.out.println("Libro " + libro.getTitulo());
			}else if(elem instanceof Participante){
				
				Participante parti = (Participante)elem;
				System.out.println("Participante " + parti.getNombre());
				
			}else {
				System.out.println("No cocnocemos esta clase");
			}
		}//end for each
		
		
	}

}
