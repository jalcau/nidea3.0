package com.impartek.nidea.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class utilidades {
	/**
	 * MEtodo estatico para poder usarse desde la propia clase, sin tener que
	 * instanciar un objeto
	 * 
	 * Limpia los caracteres vacios " " de una cadena string Hacemos trim, ademas de
	 * sustituir todos los espacios en blanco por uno unido
	 * 
	 * @param cadena
	 * @return en caso de null hacer retorna cadena vacia
	 */
	public static String limpiarEspacios(String cadena) {
		String resul = "";
		if (cadena != null) {
			resul = cadena.trim();
			resul = resul.replaceAll("\\s+", " ");

		}
		return resul;

	}

	public static List<Ordenable> bubbleSort(List<Ordenable> coleccion) {

		List<Ordenable> resul = new ArrayList<Ordenable>();
		Ordenable temp = null;
		if (coleccion != null) {
			for (int i = 0; i < coleccion.size(); i++) {
				for (int j = 1; j < coleccion.size() - i; j++) {
					if (coleccion.get(j - 1).getValor() > coleccion.get(j).getValor()) {
						temp = coleccion.get(j - 1);
						coleccion.set(j - 1, coleccion.get(j));
						coleccion.set(j, temp);
					}
				}
			}
			resul = coleccion;

		}
		return resul;

	}

}
