package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Brevetto;

public class BrevettoDAO {
	
public List<Brevetto> getBrevettiAzienda (Azienda az) {
		
		String partitaIVA = az.getPartitaIVA();
		final String sqlBrevettiAzienda = "SELECT * FROM brevetti WHERE p_iva=? ;";
		List<Brevetto> listBrevetti = new LinkedList<Brevetto>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlBrevettiAzienda);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Brevetto b = new Brevetto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
				listBrevetti.add(b);
			}
			st.close();
			conn.close();
			return listBrevetti;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	}


}
