package fr.parissportifs.paris;

public class Paris {
	private String domicile;
	private String visiteur;
	private double cote;
	private String paris;
	private double mise;
	private double gain;
	
	private int port;
	
	public Paris() {

	}	

	public Paris(String domicile, String visiteur, double cote, String paris, double mise, double gain, int port) {
		super();
		this.domicile = domicile;
		this.visiteur = visiteur;
		this.cote = cote;
		this.paris = paris;
		this.mise = mise;
		this.gain = gain;
		this.port = port;
	}
	
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	public String getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(String visiteur) {
		this.visiteur = visiteur;
	}
	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	public String getParis() {
		return paris;
	}
	public void setParis(String paris) {
		this.paris = paris;
	}
	public double getMise() {
		return mise;
	}
	public void setMise(double mise) {
		this.mise = mise;
	}
	public double getGain() {
		return gain;
	}
	public void setGain(double gain) {
		this.gain = gain;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}	
}
