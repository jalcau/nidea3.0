package com.ipartek.formacion.nidea.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Rol;

public class RolesDao implements Persistible<Rol> {

	@Override
	public ArrayList<Rol> getAll() {
		ArrayList<Rol> lista = new ArrayList<Rol>();
		String sql = "SELECT `id`, `nombre`,  FROM `rol` ";
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			Rol r = null;
			while (rs.next()) {
				r = mapper(rs);
				lista.add(r);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Rol getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Rol pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Rol mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean busquqeda(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

}
