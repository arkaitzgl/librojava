
public class JugandoConString {

	public static void main(String[] args) {

		String manolo = "Manolo Kabezabolo";

		// converetir a minusculas

		System.out.println("Convertir texto en minusculas: "+ manolo.toLowerCase());

		// converetir a mayusculas

		System.out.println("Convertir texto en mayusculas: " +manolo.toUpperCase());

		// mostrar numero de caracteres

		System.out.println(manolo.length());

		// mostrar posicion de la letra "k"(pos7)

		System.out.println("La posición de la letra k en la cadena"+manolo+" es "+ manolo.indexOf('K'));

		// separar en dos variables y "apellido" con substring
		String nombre;// Manolo
		String apellido;// Kabezabolo

		nombre = manolo.substring(0, 6);
		System.out.println("Nombre: "+nombre);
		apellido = manolo.substring(7, manolo.length());
		System.out.println("Apellido: "+apellido);

		/* Comparando */

		String c1 = "casa";
		String c2 = "Casa";

		// comparar c1 y c2 con equals

		System.out.println("casa y Casa son exactamente iguales" + c1.equals(c2));

		// comparar c1 y c2 con equalIgnoreCase

		System.out.println("casa y Casa son iguales sin importar las mayusculas? "+ c1.equalsIgnoreCase(c2));

		/* Limpiando entradas de datos */

		String c3 = "perro";
		String c4 = "    perro   ";

		// las dos variables deben ser igual=> trim

		System.out.println("Quitando espacios y comparando las palabras son iguales? " +c3.equals(c4.trim()));

		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean laoreet turpis non tellus egestas mattis. Donec vel magna quis dui blandit laoreet vitae eu enim. Integer posuere sodales nunc, ac feugiat ligula sodales porttitor. Donec vitae justo aliquam, pretium ex et, porta tellus. Suspendisse potenti. Quisque magna dolor, cursus non mi eu, porta eleifend magna. Mauris ut tincidunt enim. Aenean quam lacus, dapibus vitae dui et, fringilla venenatis nunc. Vestibulum rutrum lectus odio, ut mattis augue vulputate eget. Praesent ullamcorper justo nulla, eget fermentum enim congue in. Aliquam erat volutpat. Vestibulum dictum odio odio, vitae vehicula magna molestie vitae. Donec in leo facilisis, tempus est sed, tempor mi. Nunc pulvinar, diam volutpat hendrerit rutrum, orci sem viverra ante, a hendrerit magna odio at lorem.";

		// mostrar longitud

		System.out.println("Longitud de lorem: "+lorem.length());

		// contar las palabras

		System.out.println("Numero de palabras que contiene lorem: "+lorem.split(" ").length);

		// contar todas las vocales

		int contadorVocales = 0;
		char[] aVocales = lorem.toLowerCase().toCharArray();
		char vocal = 'a';
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < aVocales.length; i++) {
			vocal = aVocales[i];
			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == vocal) {
					contadorVocales++;
					break;
				}
			}//end for

		}

		System.out.println("voales = " + contadorVocales);
		// indicar el numero de vece que aparece 'at'
		
		int cuentaAt=0;
		String [] sVocales=lorem.trim().split(" ");
		
		for (int i = 0; i < sVocales.length; i++) {
			
			if (("at").equalsIgnoreCase(sVocales[i])==true) {
				cuentaAt++;
			}
			
		}//end for
		System.out.println("El numero total de at es: "+cuentaAt);
		
		int contaAt=0;
		
		for (int j = 0; j < aVocales.length; j++) {
			if ((aVocales[j]=='a')&&(aVocales[j+1]=='t')) {
				contaAt++;
			}
			
		}//end for
		
		System.out.println("at aparece junto o por separado: "+contaAt+ " veces");
	}

}
