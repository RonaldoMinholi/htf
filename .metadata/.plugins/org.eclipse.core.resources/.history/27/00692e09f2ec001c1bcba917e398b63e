package br.com.fiap.htf.controllers.usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import br.com.fiap.htf.models.UsuarioModel;

/**
 * Servlet implementation class UsuarioListarServlet
 */
@WebServlet("/usuario-listar")
public class UsuarioListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioListarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		//List usuario = daoUsuario.findByAll();
		
		
		
		List<UsuarioModel> usuarios = new ArrayList<>();
		usuarios.add( new UsuarioModel(1, "Antonio da Silva", "antonio@email.com") );
		usuarios.add( new UsuarioModel(2, "Beatriz de Souza", "beatriz@email.com") );
		usuarios.add( new UsuarioModel(3, "Carlos Machado", "carlos@email.com") );
		usuarios.add( new UsuarioModel(4, "Daniela Pereira", "daniela@email.com") );
		
		request.setAttribute("listaUsuarios", usuarios);
		
		
		
		request
		.getRequestDispatcher("/usuario/usuario-listar.jsp")
		.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
