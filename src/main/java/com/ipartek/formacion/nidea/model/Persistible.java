package com.ipartek.formacion.nidea.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Persistible<P> {
	/**
	 * Lista de una tabla de la base de datos ordenados por id descentente y
	 * limitado a 500
	 * 
	 * @author Curso
	 * @return Coleccion
	 */

	public ArrayList<P> getAll();

	/**
	 * Obtenemos el detalle de un registro
	 * 
	 * @param id
	 *            identificador
	 * @return Registro si existe, null en caso contrario
	 */

	public P getById(int id);

	/**
	 * Guardamos un registro en la BBDD si el id del pojo es -1 creamos en caso
	 * contrario Si el id es > 1 Modificamos
	 * 
	 * @param pojo,
	 * @return
	 * @throws SQLException
	 */
	public boolean save(P pojo);

	/**
	 * Eliminamos un registro por la identificador
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * Nos mapea un Resultado de la BBDD a un Pojo
	 * 
	 * @param rs
	 *            ResultSet
	 * @return
	 */
	public P mapper(ResultSet rs) throws SQLException;
	
	public boolean busquqeda (String nombre);

}
