import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class CalcularIva {

	public static void main(String[] args) {
		System.out.println("Calculadora IVA 21%");
		System.out.println("-------------------");
		Scanner sc = new Scanner(System.in);

		String opcion = "s";
		float importe = 0;
		boolean importeCorrecto = false;

		do {
			System.out.println("Por favor dame el importe en €");

			// Comprobar que sea un numero
			do {

				try {
					
					//ejemplo para que pase por NullPointerException
					
					/*sc =null;
					sc.next();
					*/
					
					//ejemplo para que pase por Exception e
					/*importe = 9/0;*/
					
					
					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto=true;
					
					
				}catch (NullPointerException e) {
					System.out.println("Ya mediras cmo has metido un null: -0");
				}
				catch (InputMismatchException e) {
					System.out.println("Valor incorrecto introduce un numero, por ejemplo: 123.33");
				}
				 catch (Exception e) {
					System.out.println("¿Que has hecho para que falle?");
				}
			} while (!importeCorrecto);

			// Calculo del IVA
			System.out.println("El iva repercutido: " + importe * 0.21);

			// Repetir la operacion
			System.out.println("Desea volver a calcular?");
			opcion = sc.next();
		} while (("s").equals(opcion));

		System.out.println("Agur");
		sc.close();

	}

}
