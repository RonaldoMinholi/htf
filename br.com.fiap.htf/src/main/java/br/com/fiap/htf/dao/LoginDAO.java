package br.com.fiap.htf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.htf.BO.Login;

public class LoginDAO {

	
	
	public int Add(Login cat) {
        DAO dao = new DAO();
        try {
            PreparedStatement stmt = dao.getConnection()
                    .prepareStatement("INSERT INTO T_LOGIN VALUES (SQ_IDLOGIN.NEXTVAL,?, ?)");
            stmt.setString(1, cat.getDs_email());
            stmt.setString(2, cat.getDs_senha());
            
            return dao.executeCommand(stmt);
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
}
