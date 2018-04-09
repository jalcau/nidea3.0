package com.ipartek.formacion.nidea.pojo;

public class Coche implements AutoCloseable {

	public Coche() {
		super();
		System.out.println("Creamos coche");
	}

	public void conducir() {
		System.out.println("brum burm mi coche sigue en el taller");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Paramos coche");
	}

	public static void main(String[] args) {

		// Si declaramos un objeto que implemente al interfaz autoclosable
		// dentro de {} try, cuando llega a finally se ejecuta de forma automatica
		// su metodo close();

		try (Coche c = new Coche()) {
			System.out.println("Empezamos programa");
			c.conducir();
			String nulo = null;
			nulo.length();

		} catch (Exception e) {
			System.out.println("Tenemos una excepcion");

		} finally {
			System.out.println("finalizamos");

		}

	}

}
