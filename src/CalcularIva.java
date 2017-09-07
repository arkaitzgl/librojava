import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class CalcularIva {

	public static void main(String[] args) {
		System.out.println("Calculadora IVA 21%");
		System.out.println("-------------------");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String opcion;
		do {
		System.out.println("Por favor dame el importe en €");
		
		
		
		
		float importe = sc.nextFloat();
		
		
		System.out.println("El iva repercutido: "+importe * 0.21);
		System.out.println("Desea volver a calcular?");
		opcion=sc2.nextLine();
		}while (("s").equals(opcion));
		
		System.out.println("Agur");
		sc.close();
		sc2.close();
	}

	

}
