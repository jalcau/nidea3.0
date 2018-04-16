package com.impartek.nidea.ejemplos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrdenacionInterfacesTest {
	static ArrayList<Ordenable> coleccion;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		coleccion = new ArrayList<Ordenable>();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		coleccion = null;
	}

	@Before
	public void setUp() throws Exception {
		VehiculoElectrico e1 = new VehiculoElectrico();
		e1.setPuertas(3);

		Coloreado e2 = new Coloreado();
		e2.setRadio(1);

		VehiculoElectrico e3 = new VehiculoElectrico();
		e3.setPuertas(0);
		Coloreado e4 = new Coloreado();
		e4.setRadio(9);
		coleccion.add(e1);
		coleccion.add(e2);
		coleccion.add(e3);
		coleccion.add(e4);
	}

	@After
	public void tearDown() throws Exception {
		coleccion.clear();
	}

	@Test
	public void testBubblesort() {

		utilidades.bubbleSort(coleccion);
		assertEquals(0, coleccion.get(0).getValor());
		assertEquals(1, coleccion.get(1).getValor());
		assertEquals(3, coleccion.get(2).getValor());
		assertEquals(9, coleccion.get(3).getValor());
		Ordenable elemento = coleccion.get(0);
		if (elemento instanceof Coloreado) {
			Coloreado c = (Coloreado) elemento;
		} else if (elemento instanceof VehiculoElectrico) {
			VehiculoElectrico ve = (VehiculoElectrico) elemento;
		} else {
			fail("No esperamos esta clase de Objetos");
		}

	}

	@Test
	public void testCollectiontest() {
		Collections.sort(coleccion, new ComparatorOrdenables());

		assertEquals(0, coleccion.get(0).getValor());
		assertEquals(1, coleccion.get(1).getValor());
		assertEquals(3, coleccion.get(2).getValor());
		assertEquals(9, coleccion.get(3).getValor());
	}

}
