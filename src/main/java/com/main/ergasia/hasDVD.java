package com.main.ergasia;

public class hasDVD {
private int idPurchase,DVDid,posothta;
private String DVDtitlos;
public hasDVD(int idPurchase, int dVDid, int posothta, String dVDtitlos) {
	super();
	this.idPurchase = idPurchase;
	DVDid = dVDid;
	this.posothta = posothta;
	DVDtitlos = dVDtitlos;
}
public hasDVD() {
	super();
}
public int getIdPurchase() {
	return idPurchase;
}
public void setIdPurchase(int idPurchase) {
	this.idPurchase = idPurchase;
}
public int getDVDid() {
	return DVDid;
}
public void setDVDid(int dVDid) {
	DVDid = dVDid;
}
public int getPosothta() {
	return posothta;
}
public void setPosothta(int posothta) {
	this.posothta = posothta;
}
public String getDVDtitlos() {
	return DVDtitlos;
}
public void setDVDtitlos(String dVDtitlos) {
	DVDtitlos = dVDtitlos;
}


}
