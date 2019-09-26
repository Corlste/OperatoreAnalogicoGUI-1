package Operatore_BOT_GUI.model;

public class Articolo {
	
	private String partitaIVA;
	private String title;
	private String Link;
	private String backlink;
	private String text;
	private String[] keywords;
	private String date;
	
	public Articolo(String partitaIVA, String title, String link, String backlink, String text, String keywords,
			String date) {
		super();
		this.partitaIVA = partitaIVA;
		this.title = title;
		Link = link;
		this.backlink = backlink;
		this.text = text;
		this.keywords = this.setPrivateKeywords(keywords);
		this.date = date;
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

	public String[] getKeywords() {
		return keywords;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	private String[] setPrivateKeywords (String s) {
		String[] keys = s.trim().split(",");
		return keys;
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
	
	@Override
	public String toString() {
		return this.title;
	}
	
	

}
