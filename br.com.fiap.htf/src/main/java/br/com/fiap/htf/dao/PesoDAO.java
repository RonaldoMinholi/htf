package br.com.fiap.htf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.htf.BO.Peso;

public class PesoDAO {

	public int Add(Peso cat) {
        DAO dao = new DAO();
        try {
            PreparedStatement stmt = dao.getConnection()
                    .prepareStatement("INSERT INTO T_PESO VALUES (SQ_IDPESO.NEXTVAL, ?, ?)");
            stmt.setFloat(1, cat.getVr_peso());
            stmt.setDate(2, cat.getDt_peso());
            
            return dao.executeCommand(stmt);
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
	
}
