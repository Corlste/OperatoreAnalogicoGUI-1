package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Azienda;

public class AziendaDAO {
	
	public List<Azienda> getTutteLeAziende(){
		
		final String sqlAll = "SELECT * FROM azienda";
		List<Azienda> aziende = new LinkedList<Azienda>();
		
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlAll);
			
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Azienda az = new Azienda(rs.getString("p_iva"), rs.getString("azienda"), rs.getString("indirizzo"), rs.getString("comune"), rs.getInt("CAP"), rs.getString("provincia"), rs.getString("regione"), rs.getString("codice_ateco"), rs.getBoolean("start_up"),rs.getString("descrizione_azienda"), rs.getBoolean("appartenenza_holding"),rs.getString("email"),rs.getString("telefono"), rs.getString("sito_web"), rs.getString("linkedin"), rs.getString("twitter"), rs.getString("facebook"));   
				aziende.add(az);
			}
			
			st.close();
			conn.close();
			return aziende;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Erroredb");
		}
	}
}
