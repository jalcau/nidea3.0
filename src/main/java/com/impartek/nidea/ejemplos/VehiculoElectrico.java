package com.impartek.nidea.ejemplos;

public class VehiculoElectrico extends vehiculo {
	private float potencia; // kW

	public VehiculoElectrico() {
		super();
		potencia = 0;
		System.out.println("instancia de un VehiculoElectrico");

	}

	public VehiculoElectrico(float potencia) {
		this();// cambiar super() => this()
		this.potencia = potencia;

	}

	@Override
	public String toString() {
		return super.toString() + "VehiculoElectrico [potencia=" + potencia + "]";
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public void arrancar() {
		System.out.println("pulsar boton encendido");
		vehiculo.dimeMatricula();
	}

}
