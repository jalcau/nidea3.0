package com.ipartek.formacion.nidea.controller.backoffice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.nidea.model.MaterialDAO;
import com.ipartek.formacion.nidea.pojo.Alert;
import com.ipartek.formacion.nidea.pojo.Material;

/**
 * Servlet implementation class MaterialesBackofficeController
 */
@WebServlet("/backoffice/materiales")
public class MaterialesBackofficeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MaterialDAO dao;
	private String view = "";
	private Alert alert;
	private static final String VIEW_INDEX = "materiales/index.jsp";
	private static final String VIEW_FORM = "materiales/form.jsp";
	public static final int OP_MOSTRAR_FORMULARIO = 1;
	public static final int OP_BUSQUEDA = 14;
	public static final int OP_ELIMINAR = 13;
	public static final int OP_GUARDAR = 2;
	private RequestDispatcher dispatcher;

	// parametros
	// parametros comunes search y op
	private int id;
	// search buscador por nombre material;
	private String nombre, search;
	private float precio;
	private int op;// operacion a realizar

	/**
	 * Se ejecuta la primera vez que llaman al server
	 */

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		dao = MaterialDAO.getInstance();
	}

	/**
	 * Se ejecuta cuando paramos el Servidor de Aplicaciones
	 */
	@Override
	public void destroy() {

		super.destroy();
		dao = null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Antes de Ejecutar doGet o doPost");
		super.service(req, resp);
		System.out.println("Despues de Ejecutar doGet o doPost");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	/**
	 * Unimos las peticiones doGet y doPost, vamos que los dos metodos haran lo
	 * mismo
	 * 
	 * @param request
	 * @param response
	 */
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			recogerParametros(request);
			switch (op) {
			case OP_MOSTRAR_FORMULARIO:
				mostrarFormulario(request);

				break;
			case OP_ELIMINAR:
				eliminar(request);

				break;
			case OP_BUSQUEDA:
				buscar(request);

				break;
			case OP_GUARDAR:
				guardar(request);

				break;
			default:
				listar(request);
				break;
			}

			String search = request.getParameter("search");
			System.out.println("Filtro busqueda = " + search);
			// enviar como atributo la lista de materiales

		} catch (Exception e) {
			dispatcher = request.getRequestDispatcher(VIEW_INDEX);
			e.printStackTrace();
			// view = "materiales/index.jsp";
		} finally {

			dispatcher.forward(request, response);
		}
	}

	private void guardar(HttpServletRequest request) {
		// TODO Auto-generated method stub

	}

	private void buscar(HttpServletRequest request) {
		// TODO Auto-generated method stub

	}

	private void eliminar(HttpServletRequest request) {
		// TODO Auto-generated method stub

	}

	private void listar(HttpServletRequest request) {
		request.setAttribute("materiales", dao.getAll());
		// view = "materiales/index.jsp";
		dispatcher = request.getRequestDispatcher(VIEW_INDEX);

	}

	private void mostrarFormulario(HttpServletRequest request) {
		Material material = new Material();
		if (id > -1) {

		}
		request.setAttribute("materiales", dao.getAll());
		dispatcher = request.getRequestDispatcher(VIEW_FORM);
	}

	private void recogerParametros(HttpServletRequest request) {
		if (request.getParameter("op") != null) {
			op = Integer.parseInt(request.getParameter("op"));
		}
		search = (request.getParameter("search") != null) ? request.getParameter("search") : "";

		if (request.getParameter("id") != null) {
			id = Integer.parseInt(request.getParameter("id"));
		}
		if (request.getParameter("nombre") != null) {
			nombre = request.getParameter("nombre");
		}
		if (request.getParameter("precio") != null) {
			precio = Float.parseFloat(request.getParameter("precio"));
		}
		;

	}

}
