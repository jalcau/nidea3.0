package com.impartek.nidea.ejemplos;

public class EjercicioHerencia {

	public static void main(String[] args) {
		/*
		 * No se puede crear Objetos de una clase Abstracta vehiculo rayoMacQueen = new
		 * vehiculo();
		 * 
		 * System.out.println(rayoMacQueen.toString());
		 */
		vehiculo.dimeMatricula();
		System.out.println("-----------------------------");
		VehiculoElectrico tesla = new VehiculoElectrico();
		System.out.println(tesla.toString());
		System.out.println("color: " + tesla.getColor());

	}

}
