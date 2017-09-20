package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {

	
	public static int MAYOR_EDAD =18;
	// Atributos privados para no ser accesibles desde fuera de la clase
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int num;
	private String mail;
	private String dni;
	private String funcion;

	public Persona() {
		super();

		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.num = 0;
		this.mail = "";
		this.dni = "";
		this.funcion = "";
	}

	public Persona(String nombre, String apellido1, String apellido2, int num, String mail, String dni,
			String funcion) throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		setNum(num);
		setMail(mail);
		setDni(dni);
		this.funcion = funcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getNum() {
		return num;
	}

	/**
	 * Setea la edad de la persona
	 * @param num int años de la persona
	 * @throws PersonaException edad < 18
	 */
	public void setNum(int num) throws PersonaException {
		if (num < MAYOR_EDAD) {
			throw new PersonaException(PersonaException.EXCEPTION_MENOR_EDAD);
		}
		this.num = num;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) throws PersonaException{
		if(!Validaciones.email(mail)) {
			throw new PersonaException(PersonaException.EXCEPTION_MAIL_ERROR);
		}
		
		this.mail = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws PersonaException{
		
		if(!Validaciones.dni(dni)) {
			throw new PersonaException(PersonaException.EXCEPTION_DNI_ERROR);
		}
		
	
		this.dni = dni;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", num=" + num
				+ ", mail=" + mail + ", dni=" + dni + ", funcion=" + funcion + "]";
	}

}
