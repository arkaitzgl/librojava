package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesColeciones {
	/**
	 * Ordena un Array con el metodo bubble-sort
	 * 
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado Array desordenado
	 * @param orden true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray(int[] aDesordenado, boolean orden) {

		int[] resul = aDesordenado.clone();

		int aux = 0;
		if (orden==false) {
			for (int i = 0; i < resul.length; i++)

			{
				for (int k = 0; k < resul.length; k++) {

					if (resul[i] < resul[k]) {
						aux = resul[i];
						resul[i] = resul[k];
						resul[k] = aux;
					}
				}
			}

		} else {
			
			for (int i = 0; i < resul.length; i++)

			{
				for (int k = 0; k < resul.length; k++) {

					if (resul[k] < resul[i]) {
						aux = resul[k];
						resul[k] = resul[i];
						resul[i] = aux;
					}
				}
			}

		}
		return resul;
	}

}
