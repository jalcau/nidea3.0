package com.impartek.nidea.ejemplos;

public class Circulo extends ObjetoGrafico {
	private int radio;

	public Circulo() {
		super();
		this.radio = 0;

		// TODO Auto-generated constructor stub
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void Imprimir() {
		System.out.println("Metodo Círculo imprimir");

	}

	@Override
	void dibujar() {
		System.out.println("Metodo Círculo dibujar");

	}

	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return radio;
	}

}
