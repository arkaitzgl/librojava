package com.ipartek.formacion.javalibro.pojo;

public class LineaColor extends Linea{
	
	String color;

	@Override
	void dibujar() {
		System.out.println("Soy una linea de color"+ this.color + " y longitud "+ this.longitud);
	}

}
