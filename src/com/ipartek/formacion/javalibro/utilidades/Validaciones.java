package com.ipartek.formacion.javalibro.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	/**
	 * Metodo para validar si un email es correcto
	 * 
	 * @param email a validar
	 * @return true si es valido, false en caso contrario
	 */

	public static boolean email(String email) {
		boolean resul = false;

		if (email != null) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
			resul = matcher.find();
		}

		return resul;
	}

	/**
	 * 
	 * Metodo para validar si un dni es correcto
	 * @see https://medium.com/@manuelmato/c%C3%B3mo-validar-un-dni-en-java-6d7ce7d764aa
	 * @see https://medium.com/@manuelmato/c%C3%B3mo-validar-un-dni-en-java-parte-ii-f01170487d0b
	 * @param dni a validar
	 * @returntrue si es valido, false en caso contrario
	 */
	public static boolean dni(String dni) {
		boolean resul = false;
		int i = 0;
		int caracterASCII = 0;
		char letra = ' ';
		int miDNI = 0;
		int resto = 0;
		char[] asignacionLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		if (dni != null) {
			if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {

				do {
					caracterASCII = dni.codePointAt(i);
					resul = (caracterASCII > 47 && caracterASCII < 58);
					i++;
				} while (i < dni.length() - 1 && resul);
			}

			if (resul) {
				letra = Character.toUpperCase(dni.charAt(8));
				miDNI = Integer.parseInt(dni.substring(0, 8));
				resto = miDNI % 23;
				resul = (letra == asignacionLetra[resto]);
			}
		}
		return resul;
	}

}
