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

}