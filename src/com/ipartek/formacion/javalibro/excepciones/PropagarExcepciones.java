package com.ipartek.formacion.javalibro.excepciones;
public class PropagarExcepciones {

	public static void main(String[] args) throws Exception {
		
		comoMarron();

	}

	private static void lanzoExcepcion() throws Exception {
		System.out.println("lanzoexcepcion ENTRO");
		throw new Exception();
		//System.out.println("lanzoexcepcion SALGO");

	}

	private static void pasoMarron() throws Exception {
		System.out.println("pasooMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");

	}

	private static void comoMarron() throws Exception{
		System.out.println("comoMarron ENTRO");
		throw new Exception();
		/*
		try {
			pasoMarron();
		} catch (Exception e) {
			System.out.println("Ya me encargo yo de gestionar la Excepcion");
		}
		
		System.out.println("comoMarron SALGO");
*/
	}
}
