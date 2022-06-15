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
		usuarios.add( new UsuarioModel(1, "Antonio da Silva", 70, "Masculino", 177, "antonio@email.com", null, "11991999191") );
		usuarios.add( new UsuarioModel(1, "Beatriz de Souza", 65, "Feminino", 177, "beatrizdesouza@email.com", null, "11991999292") );
		usuarios.add( new UsuarioModel(1, "Camila Machado", 60, "Feminino", 177, "camilamachado@email.com", null, "11991999393") );
		usuarios.add( new UsuarioModel(1, "Daniela Pereira", 56, "Feminino", 177, "danielapereira@email.com", null, "11991999494") );
		usuarios.add( new UsuarioModel(1, "Eduardo Alcantara", 78, "Masculino", 177, "eduardoalcantara@email.com", null, "11991999595") );
		
		
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
