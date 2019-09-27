package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;

public class ArticoloDAO {

	public List<Articolo> getArticoliAzienda(Azienda az){
		String partitaIVA  = az.getPartitaIVA();
		final String sqlArticolo = "SELECT * FROM articoli where p_iva=?";
		ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlArticolo);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Articolo articolo = new Articolo(rs.getString("p_iva"), rs.getString("Title"), rs.getString("Link"),rs.getString("Backlink"),rs.getString("Text"),
						rs.getString("Keywords"),rs.getString("Date"));
				articoli.add(articolo);
			}
			st.close();
			conn.close();
			
			az.setArticoli(articoli);
			return articoli;
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
		
		
	}
}
