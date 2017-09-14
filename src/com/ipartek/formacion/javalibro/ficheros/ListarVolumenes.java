package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarVolumenes {

	public static void main(String[] args) {
		System.out.println("Volumnenes o unidades de nuestro PC");
		File f=new File("");
		File[] volumenes = f.listRoots();
		for (File v : volumenes) {
			System.out.println(v);
			
		}
	}

}
