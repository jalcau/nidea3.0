package com.ipartek.formacion.nidea.pojo;

public class Usuario {
	private String nombre;
	private int id;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, int identificador) {
		this();
		this.nombre = nombre;
		id = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
