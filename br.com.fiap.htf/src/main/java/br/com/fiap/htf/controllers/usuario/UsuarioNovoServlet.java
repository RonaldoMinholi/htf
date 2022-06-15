package br.com.fiap.htf.controllers.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuarioNovoServlet
 */
@WebServlet("/usuario-novo")
public class UsuarioNovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioNovoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request
		.getRequestDispatcher("/usuario/usuario-novo.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		System.out.println("executando o doPost do Servlet do Usuario Novo");
		
		String nome = request.getParameter("nomeUsuario");
		String email = request.getParameter("email");
		
		System.out.println(" INSERT INTO USUARIO VALUES " + "," + email);
		
		
		request
			.getRequestDispatcher("/usuario/usuario-novo-sucesso.jsp")
			.forward(request, response);
		
	}

}
