package br.com.fiap.htf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.htf.BO.ConsumoAlim;

public class ConsumoAlimDAO {
	
	
	public int Add(ConsumoAlim cat) {
        DAO dao = new DAO();
        try {
            PreparedStatement stmt = dao.getConnection()
                    .prepareStatement("INSERT INTO T_CONSUMO_ALIM VALUES (SQ_IDCONSUMO_ALIM.NEXTVAL, ?, ?)");
            stmt.setDate(1, cat.getDt_consumo_alim());
            stmt.setFloat(2, cat.getQt_caloria_ganha());
            
            return dao.executeCommand(stmt);
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
	

}
