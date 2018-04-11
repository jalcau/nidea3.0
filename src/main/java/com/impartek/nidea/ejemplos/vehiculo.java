package com.impartek.nidea.ejemplos;

public abstract class vehiculo {
	private int puertas;
	private String color;

	public vehiculo() {
		super();// java.lang.object
		this.puertas = 3;
		this.color = "blanco";
		System.out.println("instanciado vehiculo nuevo");
	}

	@Override
	public String toString() {
		return "vehiculo [puertas=" + puertas + ", color=" + color + "]";
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public abstract void arrancar();

	public void encenderluces() {
		System.out.println("Luces encendidas");
	}

	protected static void dimeMatricula() {
		// metodo tonto para probar 'protected'
	}

	public void setColor(String color) {
		this.color = color;
	}
}