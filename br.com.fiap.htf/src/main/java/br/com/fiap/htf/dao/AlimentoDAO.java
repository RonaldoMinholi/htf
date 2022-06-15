package br.com.fiap.htf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.htf.BO.Alimento;

public class AlimentoDAO {

	
	public int Add(Alimento cat) {
        DAO dao = new DAO();
        try {
            PreparedStatement stmt = dao.getConnection()
                    .prepareStatement("INSERT INTO T_ALIMENTO VALUES (SQ_IDALIMENTO.NEXTVAL, ?, ?)");
            stmt.setString(1, cat.getNm_alimento());
            stmt.setFloat(2, cat.getQt_caloria());
            
            return dao.executeCommand(stmt);
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

}
