package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Pelicula;


public class LeerPeliculasXML {
	
	static final String PELICULAS_XML= "data\\peliculas.xml";
	static ArrayList<Pelicula> peliculas=null;
	

	public static void main(String[] args) {
	peliculas= new ArrayList<Pelicula>();
		
		System.out.println("Listado Peliculas");
		System.out.println("---------------------------------");
		
		
		//parsear el fichero XML
		
		try {
		File inputFile = new File(PELICULAS_XML);
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder dBuilder = factory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
         
         NodeList nPeliculas = doc.getElementsByTagName("pelicula");
         Pelicula p= null;
         Element element=null;
         for (int i=0; i< nPeliculas.getLength(); i++) {
        	 
        	 element = (Element)nPeliculas.item(i);
        	 
        	 String tipo= element.getAttribute("tipo");
        	 String anyo= element.getAttribute("año");
        	 String titulo = element.getElementsByTagName("titulo").item(0).getTextContent();
        	 String guionista = element.getElementsByTagName("guionista").item(0).getTextContent();
        	 String productor = element.getElementsByTagName("productor").item(0).getTextContent();
        	 String director = element.getElementsByTagName("director").item(0).getTextContent();
        	 String actor = element.getElementsByTagName("actor").item(0).getTextContent();
        	 String comentarios = element.getElementsByTagName("comentarios").item(0).getTextContent();
        	 
        	 p= new Pelicula(titulo, guionista, productor, director, actor, comentarios);
        	 		
        	 		 p.setTipo(tipo);
        	 		 p.setAnyo(anyo);
        			 peliculas.add(p);
        			 
         }
         

		 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 
		 
		//Mostrar Cancion por pantalla
		for (Pelicula p: peliculas) {
			System.out.println("Pelicula: "+ p.getTitulo());
			System.out.println("Tipo: "+ p.getTipo());
			System.out.println("Año: "+ p.getAnyo());
			System.out.println("    Guionista: " +p.getGuionista());
			System.out.println("    Productor: " +p.getProductor());
			System.out.println("    Director: "+ p.getDirector());
			System.out.println("    Actor: "+ p.getActor());
			System.out.println("    Comentarios: "+ p.getComentarios());
			
			System.out.println(" ");
		}
	}

}
