package com.ipartek.formacion.javalibro.pojo;

public class Pelicula {
	
	private String tipo;
	private String anyo;
	private String titulo;
	private String guionista;
	private String productor;
	private String director;
	private String actor;
	private String comentarios;
	
	public Pelicula(String titulo, String guionista, String productor, String director, String actor,
			String comentarios) {
		super();
		
		this.tipo= "";
		this.anyo= "";
		this.titulo = titulo;
		this.guionista = guionista;
		this.productor = productor;
		this.director = director;
		this.actor = actor;
		this.comentarios = comentarios;
		
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGuionista() {
		return guionista;
	}

	public void setGuionista(String guionista) {
		this.guionista = guionista;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Pelicula [tipo=" + tipo + ", anyo=" + anyo + ", titulo=" + titulo + ", guionista=" + guionista
				+ ", productor=" + productor + ", director=" + director + ", actor=" + actor + ", comentarios="
				+ comentarios + "]";
	}


}
