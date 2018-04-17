package com.ipartek.formacion.nidea.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Usuario;

public class UsuarioDAO implements Persistible<Usuario> {
	private static UsuarioDAO INSTANCE = null;

	private UsuarioDAO() {
	}

	// creador synchronized para protegerse de posibles problemas multi-hilo
	private synchronized static void createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioDAO();
		}
	}

	public static UsuarioDAO getInstance() {
		if (INSTANCE == null) {
			createInstance();
		}
		return INSTANCE;
	}

	@Override
	public ArrayList<Usuario> getAll() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		String sql = "SELECT `id`, `nombre`, `password` FROM `usuario` ORDER BY `id` DESC LIMIT 500";
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			Usuario u = null;
			while (rs.next()) {
				u = mapper(rs);
				lista.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Usuario getById(int id) {
		Usuario usuario = null;
		String sql = "SELECT `id`, `nombre`, `precio` FROM `nombre` WHERE `id`=? ;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, id);
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					usuario = new Usuario();
					usuario.setId(rs.getInt("id"));
					usuario.setNombre(rs.getString("nombre"));
					// usuario.setPrecio(rs.getFloat("precio"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return usuario;
	}

	@Override
	public boolean save(Usuario pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean busquqeda(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

}
