package com.ipartek.formacion.nidea.controller.backoffice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.nidea.model.MaterialDAO;

/**
 * Servlet implementation class MaterialesBackofficeController
 */
@WebServlet("/backoffice/materiales")
public class MaterialesBackofficeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String view = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String search = request.getParameter("search");
			System.out.println("Filtro busqueda = " + search);
			// enviar como atributo la lista de materiales
			MaterialDAO dao = MaterialDAO.getInstance();
			request.setAttribute("materiales", dao.getAll());
			view = "materiales/index.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			view = "materiales/index.jsp";
		} finally {

			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
