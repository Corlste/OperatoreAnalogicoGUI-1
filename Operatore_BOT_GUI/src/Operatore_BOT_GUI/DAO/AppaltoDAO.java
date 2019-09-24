package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Appalto;
import Operatore_BOT_GUI.model.Azienda;

public class AppaltoDAO {
	
	public List<Appalto> getAppaltiAzienda (Azienda az) {
		
		String partitaIVA = az.getPartitaIVA();
		final String sqlAppaltiAzienda = "SELECT * FROM appalti WHERE p_iva=? ;";
		List<Appalto> appalti = new LinkedList<Appalto>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlAppaltiAzienda);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Appalto appalto= new Appalto (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getBoolean(8), rs.getString(9),
						rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),rs.getBoolean(14), rs.getString(15), rs.getDouble(16));
				appalti.add(appalto);
			}
			st.close();
			conn.close();
			return appalti;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	
	}

}
