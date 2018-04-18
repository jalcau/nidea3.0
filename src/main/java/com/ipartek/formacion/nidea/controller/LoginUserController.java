package com.ipartek.formacion.nidea.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.nidea.pojo.Alert;
import com.ipartek.formacion.nidea.pojo.Usuario;

/**
 * Servlet implementation class LoginUserController
 */
@WebServlet("/LoginUserController")
public class LoginUserController extends HttpServlet {
	private String view = "";

	private static final long serialVersionUID = 1L;
	private HashMap<Integer, String> usuarios = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuarios = new HashMap<Integer, String>();
	}
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginUserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("LoginUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(1);
			int identificador = Integer.parseInt(request.getParameter("id"));
			String usuario = request.getParameter("nombre");
			Usuario usuario_creado = new Usuario();
			usuario_creado.setId(identificador);
			usuario_creado.setNombre(usuario);

		
			session.setAttribute("uPublic", usuario_creado);

			view = "frontend/index.jsp";
			// recoger usuarios conectados
			/*
			 * ServletContext ctx = request.getServletContext(); HashMap<Integer, String>
			 * usuarios = null; if (ctx.getAttribute("usuarios_conectados") == null) {
			 * usuarios = new HashMap<Integer, String>(); } else { usuarios =
			 * (HashMap<Integer, String>) ctx.getAttribute("usuarios_conectados"); }
			 * usuarios.put(identificador, usuario); ctx.setAttribute("usuarios_conectados",
			 * usuarios);
			 */


			request.getRequestDispatcher(view).forward(request, response);

		

	}
}
