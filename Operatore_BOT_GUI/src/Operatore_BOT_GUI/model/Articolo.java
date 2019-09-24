package Operatore_BOT_GUI.model;

public class Articolo {
	
	private String partitaIVA;
	private String title;
	private String Link;
	private String backlink;
	private String text;
	private String keywords;
	private String date;
	
	public Articolo(String partitaIVA, String title, String link, String backlink, String text, String keywords,
			String date) {
		super();
		this.partitaIVA = partitaIVA;
		this.title = title;
		Link = link;
		this.backlink = backlink;
		this.text = text;
		this.keywords = keywords;
		this.date = date;
	}

	
	
	@Override
	public String toString() {
		return "Articolo " + title;
	}

	


	public Articolo() {
		super();
	}

//	@Override
//	public String toString() {
//		return "Articolo title=" + title + ",\n Link=" + Link + ",\n backlink=" + backlink
//				+ ",\n \n \n  text=" + text + ",\n  keywords=" + keywords + ",\n date=" + date + "]";
//	}



	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getBacklink() {
		return backlink;
	}

	public void setBacklink(String backlink) {
		this.backlink = backlink;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
