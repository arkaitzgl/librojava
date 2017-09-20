package com.ipartek.formacion.javalibro.excepciones;

public class PersonaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static String EXCEPTION_MENOR_EDAD = "Los menores de 18 no pueden trabajar";
	public final static String EXCEPTION_DNI_ERROR = "Dni incorrecto";
	public final static String EXCEPTION_MAIL_ERROR= "Mail incorrecto";
	

	public PersonaException(String messageException) {
		super(messageException);
		
	}

}
