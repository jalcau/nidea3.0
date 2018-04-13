package com.ipartek.nidea.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.impartek.nidea.ejemplos.utilidades;

class UtilidadesTest {

	@Test
	public void testlimpiarEspacios() {
		assertEquals("hola que haxe", utilidades.limpiarEspacios("           hola      que      haxe"));
		assertEquals("", utilidades.limpiarEspacios(null));
	}

	/**
	 * Ordenar una coleccion con el algoritmo buuble sort, ordena de menor a mayor
	 * getValor de la interfaz ordenable
	 * 
	 * @see com.ipartek.formacion.nidea.ejemplos.Ordenable
	 * @param coleccion
	 *            List<Ordenable> coleccion con los elementos a ordenar
	 * @return en caso de null retornamos una lista vacia
	 */

}