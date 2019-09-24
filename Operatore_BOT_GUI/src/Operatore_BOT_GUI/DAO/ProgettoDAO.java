package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Progetto;

public class ProgettoDAO {
	public List<Progetto> getProgettiAzienda (Azienda az) {
		
		String partitaIVA = az.getPartitaIVA();
		final String sqlProgettiAzienda = "SELECT * FROM progetti WHERE p_iva=? ;";
		List<Progetto> progetti = new LinkedList<Progetto>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlProgettiAzienda);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Progetto progetto = new Progetto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11), rs.getString(12), rs.getBoolean(13), rs.getString(14));
				
				progetti.add(progetto);
			}
			st.close();
			conn.close();
			return progetti;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	}
}
