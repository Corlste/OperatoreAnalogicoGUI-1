package Operatore_BOT_GUI.model;

public class Brevetto {

	private String partitaIVA;
	private String appNumber;
	private String familyID;
	private String titolo;
	private String assegnatario;
	private String inventori;
	private String data;
	private String abstractBrevetto;
	private String codClass;
	private String[] keywords;
	
	public Brevetto(String partitaIVA, String appNumber, String familyID, String titolo, String assegnatario,
			String inventori, String data, String abstractBrevetto, String codClass, String keys) {
		super();
		this.partitaIVA = partitaIVA;
		this.appNumber = appNumber;
		this.familyID = familyID;
		this.titolo = titolo;
		this.assegnatario = assegnatario;
		this.inventori = inventori;
		this.data = data;
		this.abstractBrevetto = abstractBrevetto;
		this.codClass = codClass;
		this.keywords = this.setPrivateKeywords(keys);
	}
	
	

	@Override
	public String toString() {
		return titolo ;
	}



	public Brevetto() {
		super();
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getAppNumber() {
		return appNumber;
	}

	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public String getFamilyID() {
		return familyID;
	}

	public void setFamilyID(String familyID) {
		this.familyID = familyID;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAssegnatario() {
		return assegnatario;
	}

	public void setAssegnatario(String assegnatario) {
		this.assegnatario = assegnatario;
	}

	public String getInventori() {
		return inventori;
	}

	public void setInventori(String inventori) {
		this.inventori = inventori;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAbstractBrevetto() {
		return abstractBrevetto;
	}

	public void setAbstractBrevetto(String abstractBrevetto) {
		this.abstractBrevetto = abstractBrevetto;
	}

	public String getCodClass() {
		return codClass;
	}

	public void setCodClass(String codClass) {
		this.codClass = codClass;
	}
	
	
	public String getKeywordsAsString () {
		String keys = "";
		for (String s : this.keywords)
			keys += s + ", ";
		return keys;
	}
	
	
	public boolean checkKeyword (String key) {
		
		for (String k : this.keywords)
			if (k.compareTo(key)==0) return true;
		
		return false;
	}
	
	
	private String[] setPrivateKeywords (String s) {
		String[] keys = s.split(", ");
		return keys;
	}
	
	
}
