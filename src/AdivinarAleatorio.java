import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarAleatorio {

	public static void main(String[] args) {

		int num = 0;
		int numAleatorio = 0;
		Scanner sc = new Scanner(System.in);
		int intento;
		boolean numCorrecto = false;
		String opcion = "s";

		

		System.out.println("------------Adivina el numero------------");

		do {
			intento=3;
			numAleatorio = (int) (Math.random() * 10);
			
			do {

				System.out.println("Introduce el numero a adivinar (tienes " + intento + " intentos):");
				do {
					try {
						sc = new Scanner(System.in);
						num = sc.nextInt();
						numCorrecto = true;
						if (num != numAleatorio) {
							intento--;
						}

					} catch (NullPointerException e) {
						System.out.println("Ya mediras cmo has metido un null: -0");
					} catch (InputMismatchException e) {
						System.out.println("Valor incorrecto introduce un numero del 1 al 10");
					} catch (Exception e) {
						System.out.println("¿Que has hecho para que falle?");
					}
				} while (!numCorrecto);

				if (num == numAleatorio) {
					System.out.println("Has ganado!!!!");
				}
				if (intento == 0) {
					System.out.println("Te quedan: " + intento + " lo siento has perdido");
					System.out.println("El numero correcto era: " + numAleatorio);
				}
			} while ((intento != 0) && (num != numAleatorio));
			System.out.println("Desea volver a jugar?");
			opcion = sc.next();
		} while (("s").equals(opcion));
		
		System.out.println("Gracias por participar!!!!");
		sc.close();
	}

}
