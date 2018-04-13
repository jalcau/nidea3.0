package com.ipartek.nidea.listener;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.ipartek.formacion.nidea.pojo.Usuario;

/**
 * Application Lifecycle Listener implementation class
 * UsuariosConectadoslistener
 *
 */
@WebListener
public class UsuariosConectadoslistener implements HttpSessionListener, HttpSessionAttributeListener {

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		// if (event.getName().equals("uPublic")) {

		// ServletContext ctx = event.getSession().getServletContext();
		HashMap<Integer, Usuario> hmUsuarios = null;
		// if (ctx.getAttribute("usuarios_conectados") == null) {
		hmUsuarios = new HashMap<Integer, Usuario>();

	}
	// Usuario u = (Usuario) event.getValue();
	// hmUsuarios.remove(u.getId(), u);
	// ctx.setAttribute("usuarios_conectados", hmUsuarios);

	// }
	// }

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		// comproba que sea atributo == uPublic

		if (event.getName().equals("uPublic")) {

			ServletContext ctx = event.getSession().getServletContext();
			HashMap<Integer, Usuario> hmUsuarios = null;
			if (ctx.getAttribute("usuarios_conectados") == null) {
				hmUsuarios = new HashMap<Integer, Usuario>();

			}
			Usuario u = (Usuario) event.getValue();
			hmUsuarios.put(u.getId(), u);
			ctx.setAttribute("usuarios_conectados", hmUsuarios);

		}
		// contexto de la App

		// event.getSession().getServletContext()
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {

	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	}

}
