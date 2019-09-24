package Operatore_BOT_GUI.model;

public class News {
	
	private String partitaIVA;
	private long idSeriale;
	private String titolo;
	private String dataPubblicazione;
	private String abstractNews;
	private String keywords;
	private String fonte;
	
	public News(String partitaIVA, long idSeriale, String titolo, String dataPubblicazione, String abstractNews,
			String keywords, String fonte) {
		super();
		this.partitaIVA = partitaIVA;
		this.idSeriale = idSeriale;
		this.titolo = titolo;
		this.dataPubblicazione = dataPubblicazione;
		this.abstractNews = abstractNews;
		this.keywords = keywords;
		this.fonte = fonte;
	}
	
	

	@Override
	public String toString() {
		return "News" + titolo ;
	}



	public News() {
		super();
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public long getIdSeriale() {
		return idSeriale;
	}

	public void setIdSeriale(long idSeriale) {
		this.idSeriale = idSeriale;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDataPubblicazione() {
		return dataPubblicazione;
	}

	public void setDataPubblicazione(String dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}

	public String getAbstractNews() {
		return abstractNews;
	}

	public void setAbstractNews(String abstractNews) {
		this.abstractNews = abstractNews;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	
	
	

}
