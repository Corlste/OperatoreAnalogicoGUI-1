package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.ProdottoServizio;

public class ProdottoServizioDAO {

public List<ProdottoServizio> getProdottiServiziAzienda (Azienda az) {
		
		String partitaIVA = az.getPartitaIVA();
		final String sqlProdottiServiziAzienda = "SELECT * FROM prodotti_servizi WHERE p_iva=? ;";
		ArrayList<ProdottoServizio> prodottiServizi = new ArrayList<ProdottoServizio>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlProdottiServiziAzienda);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ProdottoServizio ps = new ProdottoServizio(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				prodottiServizi.add(ps);
			}
			st.close();
			conn.close();
			az.setServizi(prodottiServizi);
			return prodottiServizi;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	}

}
