package com.ipartek.formacion.nidea.pojo;

public class Usuario {
	private String nombre;
	private int id;
	private String pass;
	private Rol rol;
	public static final int ROL_USUARIO = 2;
	public static final int ROL_ADMINISTRADOR = 1;

	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.pass = "";
		this.rol = new Rol();
		// TODO Auto-generated constructor stub
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
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
