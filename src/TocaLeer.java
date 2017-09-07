
public class TocaLeer {

	/*
	 * static String [] alumnos ={"Arkaitz", "Erlantz", "Fran", "Cristian", "Leire",
	 * "Mikel", "Josu", "Alberto", "Jon", "Naiara", "Lander", "German"};
	 * 
	 */

	static String [] alumnos = { "Arkaitz",
            "Erlantz1",
            "Fran",
            "Cristian",
            "Erlantz2",
            "Leire" ,
            "Mikel",
            "Josu",
            "Alberto",
            "Jon",
            "Arantza",
            "Naiara",
            "Lander",
            "Yeray",
            "German"
          };

	static String [] Usugit = { "arkaitzgl",
            "erliglesias",
            "FranPerez92",
            "CristianVar",
            "Erlantzcabrejas",
            "LeireBustin" ,
            "zoroa84",
            "Katakume",
            "amsoria91",
            "alarconsolis",
            "",
            "naiaramateos",
            "LanderAB",
            "LordBlacKhiin",
            ""
          };
		

		public static void main(String[] args) {
			
			
			
																									
			Participante [] listaParticipantes = new Participante[alumnos.length];
			for (int i = 0; i < alumnos.length; i++) {
				listaParticipantes[i] = new Participante(alumnos[i], Usugit[i]);
			}
			int numAleatorio= generarNumeroAleatorio (alumnos.length);
			System.out.println("El/la afortunad@ es:" + listaParticipantes[numAleatorio].getNombre()+ " " +listaParticipantes[numAleatorio].getUsuarioGit());
		}
		
																								
		
		/*int numAleatorio = generarNumeroAleatorio(alumnos.length);
		
		//generar numero aleatorio
				
		System.out.println("El afortunad@ es: " + alumnos[numAleatorio]);*/

	

	/**
	 * genera numero aleatorio entre 0 y <code>max<code>
	 * 
	 * @param max
	 *            int numero maximo que puede generar la funci�n
	 * @return int aleatorio
	 */

	public static int generarNumeroAleatorio(int max) {
		// TODO falta implementar logica

		int numAleatorio2;
		numAleatorio2 = (int) (Math.random() * max);
		return numAleatorio2;
	}

}
