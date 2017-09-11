package com.ipartek.formacion.javalibro.ejercicios;
import java.text.NumberFormat;

/*
 * Ejercicio para probar las variables de java
 */
public class Variables {
	
	/**
	 * dobtener un simbolo especial ASCII de 'check' o 'cross'
	 * @param valor booleano 
	 * @return si valor true check, si false cross
	 */
	
	
	
	public static char dameSimbolo (boolean valor) {
		
		char result ='\u2716';
			if (valor) {
				result='\u2714';
			}
		return result;
		
	}

	public static void main(String[] args) {

		System.out.println("Ejercicio convariables");
		System.out.println("1. Enteros: ");
		System.out.println("2. Reales: ");
		System.out.println("3. Booleanas: ");
		System.out.println("5. Caracteres: ");

		System.out.println("Enteros: ");

		// TODO terminar de poner el resto
		System.out.println("int " + Integer.BYTES + " 4bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println("byte " + Byte.BYTES + " 1bytes " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println("short " + Short.BYTES + " 2bytes entero corto" + Short.MIN_VALUE + " " + Short.MAX_VALUE);
		System.out.println("long " + Long.BYTES + " 2bytes entero largo" + Long.MIN_VALUE + " " + Long.MAX_VALUE);

		System.out.println("Reales: ");

		System.out.println(
				"float " + Float.BYTES + " 4bytes real simple precisión " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println(
				"double " + Double.BYTES + " 8bytes real doble precisión " + Double.MIN_VALUE + " " + Double.MAX_VALUE);

		float sueldoMesGerman = 1200.25f;
		float sueldoMesLander = (float) 2400.50;

		System.out.println("German cobra " + NumberFormat.getCurrencyInstance().format(sueldoMesGerman) + " al mes");

		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');

		System.out.println("German cobra " + sSueldoGerman + " € al mes");

		char[] letra = { 'a', 'F', 'j', '3' };

		System.out.println("   Digito" + "  Letra " + " Mayus " + "\tMinus ");

		for (int i = 0; i < letra.length; i++) {

			System.out.println(letra[i] + "  " + 
					dameSimbolo(Character.isDigit(letra[i])) + "   " + 
					dameSimbolo(Character.isLetter(letra[i])) + "  " + 
					dameSimbolo(Character.isUpperCase(letra[i])) + "  " + 
					dameSimbolo(Character.isLowerCase(letra[i])) + "  ");

		}//end for

	}

}
