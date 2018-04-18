package com.ipartek.formacion.nidea.pojo;

public class Usuario {
	private String nombre;
	private int id;

	public Usuario() {
		super();
		this.id = -1;
		this.nombre = ""; 
		// TODO Auto-generated constructor stub
	}

	public Usuario(String usuario, int identificador) {
		// TODO Auto-generated constructor stub
		this();
		this.nombre = usuario;
		this.id = identificador;
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

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", id=" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

}
