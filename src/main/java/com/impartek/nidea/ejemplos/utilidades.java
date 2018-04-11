package com.impartek.nidea.ejemplos;

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

}
