package Operatore_BOT_GUI.model;

public class Appalto {

	private String partitaIVA;
	private String codiceAppalto;
	private String dataPubblicazione;
	private String dataScadenza;
	private String esito;
	private String appaltatrice;
	private String contraente;
	private boolean raggruppamento;
	private String altriContraenti;
	private String codiceCPV;
	private String oggetto;
	private String descrizione;
	private String luogoEsecuzione;
	private boolean fondiUE;
	private String codiceProgetto;
	private double valoreContratto;
	
	public Appalto(String partitaIVA, String codiceAppalto, String dataPubblicazione, String dataScadenza, String esito,
			String appaltatrice, String contraente, boolean raggruppamento, String altriContraenti, String codiceCPV,
			String oggetto, String descrizione, String luogoEsecuzione, boolean fondiUE, String codiceProgetto,
			double valoreContratto) {
		super();
		this.partitaIVA = partitaIVA;
		this.codiceAppalto = codiceAppalto;
		this.dataPubblicazione = dataPubblicazione;
		this.dataScadenza = dataScadenza;
		this.esito = esito;
		this.appaltatrice = appaltatrice;
		this.contraente = contraente;
		this.raggruppamento = raggruppamento;
		this.altriContraenti = altriContraenti;
		this.codiceCPV = codiceCPV;
		this.oggetto = oggetto;
		this.descrizione = descrizione;
		this.luogoEsecuzione = luogoEsecuzione;
		this.fondiUE = fondiUE;
		this.codiceProgetto = codiceProgetto;
		this.valoreContratto = valoreContratto;
	}
	public Appalto(String partitaIVA, String codiceAppalto) {
		super();
		this.partitaIVA = partitaIVA;
		this.codiceAppalto = codiceAppalto;
	}
	
	
	@Override
	public String toString() {
		return "Appalto " + codiceAppalto + oggetto ;
	}
	public Appalto() {
		super();
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String getCodiceAppalto() {
		return codiceAppalto;
	}
	public void setCodiceAppalto(String codiceAppalto) {
		this.codiceAppalto = codiceAppalto;
	}
	public String getDataPubblicazione() {
		return dataPubblicazione;
	}
	public void setDataPubblicazione(String dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
	public String getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public String getEsito() {
		return esito;
	}
	public void setEsito(String esito) {
		this.esito = esito;
	}
	public String getAppaltatrice() {
		return appaltatrice;
	}
	public void setAppaltatrice(String appaltatrice) {
		this.appaltatrice = appaltatrice;
	}
	public String getContraente() {
		return contraente;
	}
	public void setContraente(String contraente) {
		this.contraente = contraente;
	}
	public boolean isRaggruppamento() {
		return raggruppamento;
	}
	public void setRaggruppamento(boolean raggruppamento) {
		this.raggruppamento = raggruppamento;
	}
	public String getAltriContraenti() {
		return altriContraenti;
	}
	public void setAltriContraenti(String altriContraenti) {
		this.altriContraenti = altriContraenti;
	}
	public String getCodiceCPV() {
		return codiceCPV;
	}
	public void setCodiceCPV(String codiceCPV) {
		this.codiceCPV = codiceCPV;
	}
	public String getOggetto() {
		return oggetto;
	}
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getLuogoEsecuzione() {
		return luogoEsecuzione;
	}
	public void setLuogoEsecuzione(String luogoEsecuzione) {
		this.luogoEsecuzione = luogoEsecuzione;
	}
	public boolean isFondiUE() {
		return fondiUE;
	}
	public void setFondiUE(boolean fondiUE) {
		this.fondiUE = fondiUE;
	}
	public String getCodiceProgetto() {
		return codiceProgetto;
	}
	public void setCodiceProgetto(String codiceProgetto) {
		this.codiceProgetto = codiceProgetto;
	}
	public double getValoreContratto() {
		return valoreContratto;
	}
	public void setValoreContratto(double valoreContratto) {
		this.valoreContratto = valoreContratto;
	}
	
	
	
	
}
