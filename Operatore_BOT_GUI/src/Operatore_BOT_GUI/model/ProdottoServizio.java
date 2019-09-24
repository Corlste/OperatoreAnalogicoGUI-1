package Operatore_BOT_GUI.model;

public class ProdottoServizio {
	
	private String partitaIva;
	private String idProdottoServizio;
	private String nomeProdottoServizio;
	private String descrizione;
	private String tipologia;
	
	public ProdottoServizio(String partitaIva, String idProdottoServizio, String nomeProdottoServizio,
			String descrizione, String tipologia) {
		super();
		this.partitaIva = partitaIva;
		this.idProdottoServizio = idProdottoServizio;
		this.nomeProdottoServizio = nomeProdottoServizio;
		this.descrizione = descrizione;
		this.tipologia = tipologia;
	}
	
	

	@Override
	public String toString() {
		return "ProdottoServizio " + idProdottoServizio + ": "
				+ nomeProdottoServizio ;
	}



	public ProdottoServizio() {
		super();
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getIdProdottoServizio() {
		return idProdottoServizio;
	}

	public void setIdProdottoServizio(String idProdottoServizio) {
		this.idProdottoServizio = idProdottoServizio;
	}

	public String getNomeProdottoServizio() {
		return nomeProdottoServizio;
	}

	public void setNomeProdottoServizio(String nomeProdottoServizio) {
		this.nomeProdottoServizio = nomeProdottoServizio;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	
	

}
