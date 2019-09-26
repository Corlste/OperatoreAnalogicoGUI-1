package Operatore_BOT_GUI.model;

import java.util.*;

import Operatore_BOT_GUI.DAO.AppaltoDAO;
import Operatore_BOT_GUI.DAO.ArticoloDAO;
import Operatore_BOT_GUI.DAO.AziendaDAO;
import Operatore_BOT_GUI.DAO.BilancioDAO;
import Operatore_BOT_GUI.DAO.BrevettoDAO;
import Operatore_BOT_GUI.DAO.NewsDAO;
import Operatore_BOT_GUI.DAO.ProdottoServizioDAO;
import Operatore_BOT_GUI.DAO.ProgettoDAO;

public class Model {

	private List<Azienda> aziende;
	private Azienda azienda;
	private Azienda competitor;
	private Azienda aziendaSelezionata;
	private List<Azienda> aziendeCompetitorHome;
	
	public Model() {
		super();
		AziendaDAO dao = new AziendaDAO();
		this.aziende = dao.getTutteLeAziende();
	}

	public List<Azienda> ordineAziende(){
		Map<String,Integer> variabili = new HashMap<String,Integer>();
		for (Azienda azi : aziende) {
			variabili.put(azi.getPartitaIVA(), 0);
		}
		
		BilancioDAO bilancioDAO = new BilancioDAO();
		List<Bilancio> bilanci = bilancioDAO.getTuttiIBilanci();
		List<Azienda> aziendeOrdinate = new LinkedList<Azienda>();
		for (Azienda a: aziende) {
			for (Azienda b: aziende) {
				
				int punteggio = variabili.get(a.getPartitaIVA()) +3 ;
				variabili.replace(a.getPartitaIVA(), punteggio);
				
			}
		}
		return aziendeOrdinate;
		
		
	}
	
	
	public ArrayList<Articolo> getArticoliCorrelati (String keyword){
		
		ArrayList<Articolo> art_correlati = new ArrayList<Articolo>();
		for (Articolo art : this.getAllArticles()) {
			if (art.checkKeyword(keyword)) art_correlati.add(art);
		}
		
		return art_correlati;
	}
	
	
	
	private ArrayList<Articolo> getAllArticles (){
		ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		
		ArticoloDAO artDAO = new ArticoloDAO();
		
		for (Azienda az : aziende) {
			articoli.addAll(artDAO.getArticoliAzienda(az));
			System.out.println(az.getNomeAzienda());
		}
		
		return articoli;
	}
	
	
	
	public List<Azienda> getAziendeCompetitorHome() {
		return aziendeCompetitorHome;
	}

	public void setAziendeCompetitorHome(List<Azienda> aziendeCompetitorHome) {
		this.aziendeCompetitorHome = aziendeCompetitorHome;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	
	
	public Azienda getAziendaSelezionata() {
		return aziendaSelezionata;
	}

	public void setAziendaSelezionata(Azienda aziendaSelezionata) {
		this.aziendaSelezionata = aziendaSelezionata;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public List<Azienda> getAziende() {
		return aziende;
	}
	
	public List<Azienda> getAziendeMenoSelezionata(Azienda azienda){
//		List<Azienda> azs = this.aziende;
//		azs.remove(azienda);
//		return azs;
		return aziende;
	}

	public void setAziende(List<Azienda> aziende) {
		this.aziende = aziende;
	}
	
	
	
	public Azienda getCompetitor() {
		return competitor;
	}


	public void setCompetitor(Azienda competitor) {
		this.competitor = competitor;
	}


	public void getInfoAzienda (Azienda azienda) {
		
		
	}
	
	public Bilancio getBilancioAziendaAnno(Azienda azienda, int anno) {
		BilancioDAO bilancioDAO = new BilancioDAO();
		Bilancio bilancio = bilancioDAO.getBilancioAziendaAnno(azienda, anno);
		return bilancio;
	}
	
	public Bilancio getRicaviAziendaAnnoProva(Azienda azienda, int anno) {
		BilancioDAO bilancioDAO = new BilancioDAO();
		Bilancio bilancio = bilancioDAO.getRicaviAziendaAnno(azienda, anno);
		return bilancio;
	}
	
	public List<Appalto> getAppaltiAzienda(Azienda azienda) {
		AppaltoDAO appaltoDAO = new AppaltoDAO();
		List<Appalto> appalti = appaltoDAO.getAppaltiAzienda(azienda);
		return appalti;
	}
	
	public List<Progetto> getProgettiAzienda(Azienda azienda){
		ProgettoDAO progettoDAO = new ProgettoDAO();
		List<Progetto> progetti = progettoDAO.getProgettiAzienda(azienda);
		return progetti;
	}
	
	public List<Articolo> getArticoliAzienda(Azienda azienda){
		ArticoloDAO articoloDAO = new ArticoloDAO();
		List<Articolo> articoli = articoloDAO.getArticoliAzienda(azienda);
		return articoli;
		
	}
	
	public List<News> getNewsAzienda (Azienda azienda){
		NewsDAO newsDAO = new NewsDAO();
		List<News> listNews = newsDAO.getNewsAzienda(azienda);
		return listNews;
	}
	
	
	public List<ProdottoServizio> getProdottiServizi (Azienda azienda){
		ProdottoServizioDAO prodservDAO = new ProdottoServizioDAO();
		List<ProdottoServizio> prodServ = prodservDAO.getProdottiServiziAzienda(azienda);
		return prodServ;
	}
	
	public List<Brevetto> getBrevettiAzienda (Azienda azienda){
		BrevettoDAO brevettoDAO = new BrevettoDAO();
		List<Brevetto> brevetti = brevettoDAO.getBrevettiAzienda(azienda);
		return brevetti;
	}
	
	
}
