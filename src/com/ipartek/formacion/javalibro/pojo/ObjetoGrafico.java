package com.ipartek.formacion.javalibro.pojo;

/**
 * Una clase abstarc puede contener codigo implementado
 * pero tiene que tener algun metodo SIN implementar (abstrac)
 * Es algo intermedio entre Class e Interface
 * No puede instanciar objetos.
 * Las clases hijas deben implementar los metodos abstractos o volver a declararlos abstrac
 * 
 * @author Administrador
 *
 */

public abstract class ObjetoGrafico {
	
	int x;
	int y;
	
	void mover (int xPos, int yPos) {
		this.x=xPos;
		this.y=yPos;
	}

	abstract void dibujar () ;
	
}
