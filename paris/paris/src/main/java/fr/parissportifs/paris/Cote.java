package fr.parissportifs.paris;

public class Cote {
	private Long id;
	  
	private String domicile;
	private String visiteur;
	private double c1;
	private double cn;
	private double c2;
	private int port;
	  
	public Cote() {
		  
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getCn() {
		return cn;
	}

	public void setCn(double cn) {
		this.cn = cn;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
