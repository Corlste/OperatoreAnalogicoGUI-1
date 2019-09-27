package Operatore_BOT_GUI.model;
import java.util.ArrayList;


public class Azienda {
		
		private String partitaIVA;
		private String nomeAzienda;
		private String ragioneSociale;
		private int webRepIndex = 0;
		
		private ArrayList<Brevetto> brevetti = new ArrayList<Brevetto>();
		private ArrayList<Articolo> articoli = new ArrayList<Articolo>();

		
		private String indirizzo;
		private String comune;
		private int CAP;
		private String provincia;
		private String regione;
		private String codiceAteco;
		private Boolean startup;
		private String descrizioneAzienda;
		private Boolean appartenenzaHolding;
		private String email;
		private String telefono;
		private String sitoWeb;
		private String linkedin;
		private String twitter;
		private String facebook;
		
		public Azienda(String partitaIVA, String nomeAzienda, String indirizzo, String comune, int CAP,
				String provincia, String regione, String codiceAteco, Boolean startup, String descrizioneAzienda,
				Boolean appartenenzaHolding, String email, String telefono, String sitoWeb, String linkedin,
				String twitter, String facebook) {
			super();
			this.partitaIVA = partitaIVA;
			this.nomeAzienda = nomeAzienda;
			this.indirizzo = indirizzo;
			this.comune = comune;
			this.CAP = CAP;
			this.provincia = provincia;
			this.regione = regione;
			this.codiceAteco = codiceAteco;
			this.startup = startup;
			this.descrizioneAzienda = descrizioneAzienda;
			this.appartenenzaHolding = appartenenzaHolding;
			this.email = email;
			this.telefono = telefono;
			this.sitoWeb = sitoWeb;
			this.linkedin = linkedin;
			this.twitter = twitter;
			this.facebook = facebook;
		}

		public Azienda (String nome, String iva, String ragione) {
			this.partitaIVA = iva;
			this.nomeAzienda = nome;
			this.ragioneSociale = ragione;
		}

		public String getPartitaIVA() {
			return partitaIVA;
		}

		public String getNomeAzienda() {
			return nomeAzienda;
		}

		public ArrayList<Brevetto> getBrevetti() {
			return brevetti;
		}
		
		public ArrayList<Articolo> getArticoli() {
			return articoli;
		}
		
		// INSERISCE LISTA BREVETTI
		public void insertBrevetti (ArrayList<Brevetto> lista) {

			for (Brevetto b : lista) {
				brevetti.add(b);			
			}
		}
		
		// INSERISCE SINGOLO BREVETTO
		public void insertBrevetto (Brevetto b) {

			brevetti.add(b);
		}
		
		public int countBrevetti () {
			
			return brevetti.size();
		}
		
		public int countArticoli () {
			
			return articoli.size();
		}
		

		public int getWebRepIndex() {
			return webRepIndex;
		}

		public void setWebRepIndex(int webRepIndex) {
			this.webRepIndex = webRepIndex;
		}
		
		public String getRagioneSociale() {
			return ragioneSociale;
		}

		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}
		

		public String getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}

		public String getComune() {
			return comune;
		}

		public void setComune(String comune) {
			this.comune = comune;
		}

		public int getCAP() {
			return CAP;
		}

		public void setCAP(int cAP) {
			CAP = cAP;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getRegione() {
			return regione;
		}

		public void setRegione(String regione) {
			this.regione = regione;
		}

		public String getCodiceAteco() {
			return codiceAteco;
		}

		public void setCodiceAteco(String codiceAteco) {
			this.codiceAteco = codiceAteco;
		}

		public Boolean getStartup() {
			return startup;
		}

		public void setStartup(Boolean startup) {
			this.startup = startup;
		}

		public String getDescrizioneAzienda() {
			return descrizioneAzienda;
		}

		public void setDescrizioneAzienda(String descrizioneAzienda) {
			this.descrizioneAzienda = descrizioneAzienda;
		}

		public Boolean getAppartenenzaHolding() {
			return appartenenzaHolding;
		}

		public void setAppartenenzaHolding(Boolean appartenenzaHolding) {
			this.appartenenzaHolding = appartenenzaHolding;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getSitoWeb() {
			return sitoWeb;
		}

		public void setSitoWeb(String sitoWeb) {
			this.sitoWeb = sitoWeb;
		}

		public String getLinkedin() {
			return linkedin;
		}

		public void setLinkedin(String linkedin) {
			this.linkedin = linkedin;
		}

		public String getTwitter() {
			return twitter;
		}

		public void setTwitter(String twitter) {
			this.twitter = twitter;
		}

		public String getFacebook() {
			return facebook;
		}

		public void setFacebook(String facebook) {
			this.facebook = facebook;
		}

		public void setPartitaIVA(String partitaIVA) {
			this.partitaIVA = partitaIVA;
		}

		public void setNomeAzienda(String nomeAzienda) {
			this.nomeAzienda = nomeAzienda;
		}

		public void setBrevetti(ArrayList<Brevetto> brevetti) {
			this.brevetti = brevetti;
		}
		
		public void setArticoli(ArrayList<Articolo> brevetti) {
			this.articoli = brevetti;
		}

		@Override
		public String toString() {
			return "Azienda " + nomeAzienda+" "+ ragioneSociale + ", Partita iva "+ partitaIVA +";";
		}

		
		
		
}
