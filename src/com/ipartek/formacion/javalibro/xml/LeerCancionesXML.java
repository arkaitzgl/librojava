package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Cancion;

/**
 * Ejercicio para aprender a leer o parsear un documento.XML
 * @author Administrador
 *
 */


public class LeerCancionesXML {
	
	static final String CANCIONES_XML= "data\\canciones.xml";
	static ArrayList<Cancion> canciones=null;
	
	

	public static void main(String[] args) {
		
		canciones= new ArrayList<Cancion>();
		
		System.out.println("Listado Canciones");
		System.out.println("---------------------------------");
		
		
		//parsear el fichero XML
		
		try {
		File inputFile = new File(CANCIONES_XML);
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder dBuilder = factory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
         
         NodeList nCanciones = doc.getElementsByTagName("cancion");
         Cancion c= null;
         Element element=null;
         for (int i=0; i< nCanciones.getLength(); i++) {
        	 
        	 element = (Element)nCanciones.item(i);
        	 
        	 long id= Long.parseLong(element.getAttribute("id"));
        	 String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
        	 String artista = element.getElementsByTagName("artista").item(0).getTextContent();
        	 String duracion = element.getElementsByTagName("duracion").item(0).getTextContent();
        	 
        	 
        	 c= new Cancion(nombre, artista, duracion);
        	 		 c.setId(id);
        			 canciones.add(c);
        	 
         }
         

		 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 
		 
		//Mostrar Cancion por pantalla
		for (Cancion c: canciones) {
			System.out.println("Cancion "+ c.getId());
			System.out.println("    Nombre " +c.getTitulo());
			System.out.println("    Artista " +c.getArtista());
			System.out.println("    Duracion "+ c.getDuracion());
			System.out.println(" ");
		}
	}

}
