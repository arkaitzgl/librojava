package com.ipartek.formacion.javalibro.ejercicios;
/**
 * Las variables primitivas se pasan por valor
 * Las variables de Clase se pasan por referencia
 * @author Administrador
 *
 */



public class VariabkesReferenciaYValor {

	public static void main(String[] args) {
		//Las variables primitivas se pasan por valor
		int primitiva =1;
		System.out.println("primitiva=  " + primitiva);
		int primitiva2=sumar(primitiva);
		System.out.println("primitiva2=  " + primitiva2);

		
		//TODO probarlo bien para que cambien el valor las dos variables
		//Las variables de Clase se pasan por referencia
		String referencia = "1";
		String referencia2 = sumar(referencia);
		System.out.println("referencia= " + referencia);
		System.out.println("referencia2= " + referencia2);
	}

	static int sumar (int i) {
		return ++i;
	}
	static String sumar (String s) {
		s= "2";
		return s;
	}
	
}

