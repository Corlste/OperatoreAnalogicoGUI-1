package Operatore_BOT_GUI.DAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Bilancio;

public class BilancioDAO {

//	public List<Bilancio> getTuttiIBilanci(){
//		
//		final String sqlAllBilanci = "SELECT * FROM bilancio";
//		List<Bilancio> bilanci = new LinkedList<Bilancio>();
//		
//		try {
//			Connection conn = DBConnect.getConnection();
//			PreparedStatement st = conn.prepareStatement(sqlAllBilanci);
//			ResultSet rs = st.executeQuery();
//			while (rs.next()) {
//				Bilancio bil = new Bilancio(rs.getString(1), rs.getInt(2),rs.getString(3), rs.getDouble(4), rs.getDouble(5), 
//						rs.getDouble(6),rs.getDouble(7),rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),rs.getFloat(11),rs.getFloat(12),
//						rs.getFloat(13),rs.getFloat(14),rs.getFloat(15),rs.getFloat(16),rs.getFloat(17),rs.getFloat(18),rs.getFloat(19),
//						rs.getFloat(20),rs.getFloat(21),rs.getFloat(22),rs.getFloat(23),rs.getFloat(24),rs.getFloat(25),rs.getFloat(26),
//						rs.getFloat(27),rs.getFloat(28),rs.getFloat(29),rs.getFloat(30),rs.getFloat(31),rs.getFloat(32),rs.getFloat(33)); 
//				bilanci.add(bil);
//				
//			}
//			st.close();
//			conn.close();
//			return bilanci;
//		}catch (SQLException e) {
//			e.printStackTrace();
//			throw new RuntimeException("Errore DB");
//		}
//	}

//	
//	public Bilancio getBilancioAziendaAnno(Azienda az, int anno) {
//		String partitaIVA = az.getPartitaIVA();
//		final String sqlBilancioAnno = "SELECT * FROM bilancio WHERE p_iva = ? and anno = ?";
//		Bilancio bilancio = new Bilancio(partitaIVA, anno);
//		try {
//			Connection conn = DBConnect.getConnection();
//			PreparedStatement st = conn.prepareStatement(sqlBilancioAnno);
//			st.setString(1, partitaIVA);
//			st.setInt(2, anno);
//			
//			ResultSet rs = st.executeQuery();
//			
//			while (rs.next()) {
//				bilancio = new Bilancio(rs.getString(1), rs.getInt(2),rs.getString(3), rs.getDouble("ricavi"), rs.getDouble(5), 
//						rs.getDouble(6),rs.getDouble(7),rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),rs.getFloat(11),rs.getFloat(12),
//						rs.getFloat(13),rs.getFloat(14),rs.getFloat(15),rs.getFloat(16),rs.getFloat(17),rs.getFloat(18),rs.getFloat(19),
//						rs.getFloat(20),rs.getFloat(21),rs.getFloat(22),rs.getFloat(23),rs.getFloat(24),rs.getFloat(25),rs.getFloat(26),
//						rs.getFloat(27),rs.getFloat(28),rs.getFloat(29),rs.getFloat(30),rs.getFloat(31),rs.getFloat(32),rs.getFloat(33)); 
//				}
//			st.close();
//			conn.close();
//			az.insertBilancio(bilancio);
//			return bilancio;
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			throw new RuntimeException("Errore DB");
//		}
//	}
//	
	
	public ArrayList<Bilancio> getBilanciByAzienda (Azienda azienda){
		final String sqlBilanciByAzienda = "SELECT * FROM bilancio WHERE p_iva = ?";
		ArrayList<Bilancio> bilanci = new ArrayList<Bilancio>();
		
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlBilanciByAzienda);
			st.setString(1, azienda.getPartitaIVA());
			
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Bilancio bil = new Bilancio(rs.getString(1), rs.getInt(2),rs.getString(3), rs.getDouble(4), rs.getDouble(5), 
						rs.getDouble(6),rs.getDouble(7),rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),rs.getFloat(11),rs.getFloat(12),
						rs.getFloat(13),rs.getFloat(14),rs.getFloat(15),rs.getFloat(16),rs.getFloat(17),rs.getFloat(18),rs.getFloat(19),
						rs.getFloat(20),rs.getFloat(21),rs.getFloat(22),rs.getFloat(23),rs.getFloat(24),rs.getFloat(25),rs.getFloat(26),
						rs.getFloat(27),rs.getFloat(28),rs.getFloat(29),rs.getFloat(30),rs.getFloat(31),rs.getFloat(32),rs.getFloat(33)); 
				bilanci.add(bil);
				
			}
			st.close();
			conn.close();
			azienda.setBilanci(bilanci);
			return bilanci;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	}
	
//		
//		public Bilancio getRicaviAziendaAnno(Azienda az, int anno) {
//			String partitaIVA = az.getPartitaIVA();
//			final String sqlBilancioAnno = "SELECT p_iva, anno, ricavi FROM bilancio WHERE p_iva = ? and anno = ?";
//			Bilancio bilancio = new Bilancio(partitaIVA, anno);
//			try {
//				Connection conn = DBConnect.getConnection();
//				PreparedStatement st = conn.prepareStatement(sqlBilancioAnno);
//				st.setString(1, partitaIVA);
//				st.setInt(2, anno);
//				
//				System.out.println(st);
//				ResultSet rs = st.executeQuery();
//				
//				while (rs.next()) {
//					bilancio.setRicavi(rs.getDouble("ricavi"));
//					
////					System.out.println(rs.getString(4));
//					System.out.println();
//					System.out.println(bilancio);
//					
//				}
//				st.close();
//				conn.close();
//				return bilancio;
//				
//			}catch(SQLException e) {
//				e.printStackTrace();
//				throw new RuntimeException("Errore DB");
//			}
//		
//	}
}
