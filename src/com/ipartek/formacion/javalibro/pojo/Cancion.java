package com.ipartek.formacion.javalibro.pojo;

public class Cancion {
	
	
	//Atributos privados para no ser accesibles desde fuera de la clase
	private String titulo;
	private String artista;
	private String duracion;

	//Constructores
	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}


	
	//Getters y setters son necesarios para mantener la encapsulacion
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	public String toString() {
		return "Cancion [titulo=" + this.titulo + ", artista=" + this.artista + ", duracion=" + this.duracion + "]";
	}
	
	
}
