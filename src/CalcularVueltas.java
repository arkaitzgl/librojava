/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.
	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valorCompra = 1326.24f;
		int billetesPago = 500;
		float vueltasCompra = 0f;

		final float[] DINERO = { 50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		int[] dineroDevuelto = new int[12];
		
		vueltasCompra = (billetesPago * 4) - valorCompra;
		System.out.println(vueltasCompra+" euros de vuelta");
		 {
			
			for (int i = 0; i < DINERO.length; i++) {
				while ((vueltasCompra > DINERO[i])&&(vueltasCompra > 0)){
					vueltasCompra = vueltasCompra - DINERO[i];
					dineroDevuelto[i]++;
				}//end while dentro for

			}//end for

		}//end while
		for (int j = 0; j < dineroDevuelto.length; j++) {
			
			System.out.println("Moneda o billete de " +DINERO[j]+"€" + " devuelve un total de " + dineroDevuelto[j]);
		}
		
	}

}
