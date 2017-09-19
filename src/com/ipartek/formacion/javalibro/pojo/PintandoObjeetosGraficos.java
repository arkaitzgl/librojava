package com.ipartek.formacion.javalibro.pojo;

public class PintandoObjeetosGraficos {

	public static void main(String[] args) {
		
		
		//una clase abstracta no se puede instanciar
		//ObjetoGrafico oj= new ObjetoGrafico();
		
		//una interfaz tampoco se puede instanciar
		//Vendible v = new Vendible();
		
		Circulo c= new Circulo();
		c.dibujar();
		c.mover(12, 0);
		
		
		
		LineaColor lc= new LineaColor();
		lc.color="rojo";
		lc.longitud=56;
		lc.mover(99, -12);    //metodo objeto grafico
		lc.dibujar();		 // metodo grafico objeto grafico
		
		
				
	
		
	}

}
