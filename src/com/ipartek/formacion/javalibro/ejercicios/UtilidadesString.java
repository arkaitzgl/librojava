package com.ipartek.formacion.javalibro.ejercicios;

public class UtilidadesString {
	
	/**
	 * Cuenta las palabras que esten contenidas dentro del 'testo'
	 * @param texto String donde buscar la palabra
	 * @param busqueda String palabra que buscamos dentro del 'texto'
	 * @return int 0 si no encuentra, numero de palabras encontradas
	 */
	static int buscarPalabra (String texto, String busqueda) {

		int resul= -1;
		
		if (texto==null || busqueda==null) {
			resul=0;
		}else {
			
			int cont=0;
			String [] sVocales=texto.trim().split(" ");
			
			for (int i = 0; i < sVocales.length; i++) {
				
				if (sVocales[i].equalsIgnoreCase(busqueda)==true) {
					cont++;
				}
				
			
			}
			
			
			resul=cont;
			
		}
		
		
		return resul;
	}
	
	
	
	

}
