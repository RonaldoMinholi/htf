package br.com.fiap.htf.execute;

import br.com.fiap.htf.BO.Login;
import br.com.fiap.htf.dao.LoginDAO;


public class TesteLogin {
	
	public static void main (String [] args) {
        Login cat = new Login();

        cat.setDs_email("joaodasilva@email.com");
        cat.setDs_senha("101010");

        LoginDAO cDao = new LoginDAO();
        System.out.println("Logado" + cDao.Add(cat));

    }

}
