package com.ipartek.formacion.javalibro.pojo;


public class LibrosRecomendados {

	public static void main(String[] args) {
		
		Libro l = new Libro ("100 años de soledad");
		l.setAutor("Gabriel García");
		l.setPaginas(307);
		
		l.metodoProtegido();
		
		System.out.println(l.getPrecio());
		
		LibroElectronico le= new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setPaginas(523);
		
		le.metodoProtegido();
		
		System.out.println(le.getPrecio());
		
		LibroPapel lp = new LibroPapel("PAPILLÓN");
		lp.setAutor("CHARRIERE, HENRI");
		lp.setTapaBlanda(false);
		lp.setPaginas(789);
		
		System.out.println(lp.getPrecio());
		
		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		
		
		le.imorimir();
	}

	
}
