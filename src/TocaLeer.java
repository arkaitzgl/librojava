
public class TocaLeer {

	static String [] alumnos ={"Arkaitz", 
								"Erlantz", 
								"Fran", 
								"Cristian", 
								"Leire", 
								"Mikel", 
								"Josu",
								"Alberto",
								"Jon", 
								"Naiara", 
								"Lander",
								"German"};
	
	
	public static void main(String[] args) {
		
		
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length);
		
		//generar numero aleatorio
				
		System.out.println("El afortunad@ es: " + alumnos[numAleatorio]);

	}

/**
 * genera numero aleatorio entre 0 y <code>max<code>
 * @param max int numero maximo que puede generar la función
 * @return int aleatorio
 * */	
	
	public static int generarNumeroAleatorio (int max){
		//TODO falta implementar logica
		
		int numAleatorio2;
		numAleatorio2 = (int) (Math.random()*max);
		return numAleatorio2;
	}
	
	
}
