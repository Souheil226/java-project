package Exo;

import java.time.LocalDate;

public class Element {

	
	private int id;
	private double sellPrice;
	private String commmericalName;
	private LocalDate expiryDate ;
	
	
	
	public Element(int id, double sellPrice, String commmericalName, LocalDate expiryDate) {
		super();
		this.id = id;
		this.sellPrice = sellPrice;
		this.commmericalName = commmericalName;
		this.expiryDate = expiryDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSellPrice() {
		return sellPrice;
	}



	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}



	public String getCommmericalName() {
		return commmericalName;
	}



	public void setCommmericalName(String commmericalName) {
		this.commmericalName = commmericalName;
	}



	public LocalDate getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
