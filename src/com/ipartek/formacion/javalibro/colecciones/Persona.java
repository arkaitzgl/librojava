package com.ipartek.formacion.javalibro.colecciones;

public class Persona {
	
	// Atributos privados para no ser accesibles desde fuera de la clase
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String num;
	private String mail;
	private String dni;
	private String funcion;	
	
	public Persona() {
		super();
		
		this.nombre="";
		this.apellido1="";
		this.apellido2="";
		this.num="";
		this.mail="";
		this.dni="";
		this.funcion="";
	}
	
	public Persona(String nombre, String apellido1, String apellido2, String num, String mail, String dni,
			String funcion) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.num=num;
		this.mail = mail;
		this.dni = dni;
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
