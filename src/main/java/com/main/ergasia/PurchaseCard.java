package com.main.ergasia;

public class PurchaseCard {
private int id;
private String hmDhmiourgias;
private int katastash;
private String onomaUser;

public PurchaseCard() {
	
}
public PurchaseCard(int id, String hmDhmiourgias, int katastash, String onomaUser) {
	super();
	this.id = id;
	this.hmDhmiourgias = hmDhmiourgias;
	this.katastash = katastash;
	this.onomaUser = onomaUser;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHmDhmiourgias() {
	return hmDhmiourgias;
}
public void setHmDhmiourgias(String hmDhmiourgias) {
	this.hmDhmiourgias = hmDhmiourgias;
}
public int getKatastash() {
	return katastash;
}
public void setKatastash(int katastash) {
	this.katastash = katastash;
}
public String getOnomaUser() {
	return onomaUser;
}
public void setOnomaUser(String onomaUser) {
	this.onomaUser = onomaUser;
}


}
