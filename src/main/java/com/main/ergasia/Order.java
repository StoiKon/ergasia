package com.main.ergasia;

public class Order {
private int id,katastash;
private String dieu8Paradoshs,hmDhmiourgias,hmOloklhrwshs;
private String onomaUser;
private int purchaseId;
public Order() {
	
}
public Order(int id, int katastash, String dieu8Paradoshs, String hmDhmiourgias, String hmOloklhrwshs, String onomaUser,
		int purchaseId) {
	super();
	this.id = id;
	this.katastash = katastash;
	this.dieu8Paradoshs = dieu8Paradoshs;
	this.hmDhmiourgias = hmDhmiourgias;
	this.hmOloklhrwshs = hmOloklhrwshs;
	this.onomaUser = onomaUser;
	this.purchaseId = purchaseId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getKatastash() {
	return katastash;
}
public void setKatastash(int katastash) {
	this.katastash = katastash;
}
public String getDieu8Paradoshs() {
	return dieu8Paradoshs;
}
public void setDieu8Paradoshs(String dieu8Paradoshs) {
	this.dieu8Paradoshs = dieu8Paradoshs;
}
public String getHmDhmiourgias() {
	return hmDhmiourgias;
}
public void setHmDhmiourgias(String hmDhmiourgias) {
	this.hmDhmiourgias = hmDhmiourgias;
}
public String getHmOloklhrwshs() {
	return hmOloklhrwshs;
}
public void setHmOloklhrwshs(String hmOloklhrwshs) {
	this.hmOloklhrwshs = hmOloklhrwshs;
}
public String getOnomaUser() {
	return onomaUser;
}
public void setOnomaUser(String onomaUser) {
	this.onomaUser = onomaUser;
}
public int getPurchaseId() {
	return purchaseId;
}
public void setPurchaseId(int purchaseId) {
	this.purchaseId = purchaseId;
}


}
