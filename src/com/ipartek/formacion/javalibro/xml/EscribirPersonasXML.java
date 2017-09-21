package com.ipartek.formacion.javalibro.xml;

/**
 * Ejercicio para convertir data/personas.txt a data/persona.xml
 * 
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 * 
 * Estructura del xml:<br>
 * 
 * <personas>
 * 		<persona>
 * 			<nombre>Ted</nombre>
 * 			<apellido1>Upton</apellido1>
 * 			<apellido2>Sant Andreu De La Barca</apellido2>
 * 			<edad>8</edad>
 * 			<email>tedfupton@mailinator.com</email>
 * 			<dni>12277015Y</dni>
 * 			<rol>TRABAJADOR</rol>
 * 		</persona>
 * 		<persona>
 * 			...
 * 		</persona>
 * </personas>
 * 
 * 
 * @author Administrador
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirPersonasXML {

	static final String PATH_FICHERO_PERSONAS = "data\\personas.txt";

	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;

	public static void main(String[] args) {

		ArrayList<Persona> lista = new ArrayList<Persona>();
	

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// crear nodo raiz
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);

			rellenarArrayList();
			
			
			for (int i = 0; i < lista.size(); i++) {
				

			// añadir elementos personas al nodo raiz
				
			Element ePersona = doc.createElement("persona");
			Element eNombre = doc.createElement("nombre");
			eNombre.setTextContent(lista.get(i).getNombre());
			Element eApellido1 = doc.createElement("apellido1");
			eNombre.setTextContent(lista.get(i).getApellido1());
			Element eApellido2 = doc.createElement("apellido2");
			eNombre.setTextContent(lista.get(i).getApellido2());
			Element eEdad = doc.createElement("edad");
			eNombre.setTextContent(String.valueOf(lista.get(i).getNum()));
			Element eEmail = doc.createElement("email");
			eNombre.setTextContent(lista.get(i).getMail());
			Element eDni = doc.createElement("dni");
			eNombre.setTextContent(lista.get(i).getDni());
			Element eRol = doc.createElement("rol");
			eNombre.setTextContent(lista.get(i).getFuncion());
			ePersona.appendChild(eNombre);
			ePersona.appendChild(eApellido1);
			ePersona.appendChild(eApellido2);
			ePersona.appendChild(eEdad);
			ePersona.appendChild(eEmail);
			ePersona.appendChild(eDni);
			ePersona.appendChild(eRol);
			rootElement.appendChild(ePersona);
			
			}

			// Guardar en fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("data\\personas.xml"));
			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void rellenarArrayList() {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] partes;
			while ((linea = br.readLine()) != null) {

				partes = linea.split(",");

				try {
					p = mapeoLinea(partes);
					
					lista.add(p);
				} catch (Exception e) {

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y reader");
				e.printStackTrace();
			}
		}
	}

	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], 
								campos[CAMPOS_APE1], 
								campos[CAMPOS_APE2],
								Integer.parseInt(campos[CAMPOS_EDAD]), 
								campos[CAMPOS_MAIL], 
								campos[CAMPOS_DNI], 
								campos[CAMPOS_ROL]);
		return p;
	}

}
