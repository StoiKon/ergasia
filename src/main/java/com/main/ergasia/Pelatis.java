package com.main.ergasia;

public class Pelatis extends User {
private String ari8mosKartas;
private String eidosKartas;
private String hmeromhniaLhjhs;
private String kwdikosAsfaleiasKartas;
private String onomaUser;
public Pelatis(String username,String password,String ari8mosKartas, String eidosKartas, String hmeromhniaLhjhs, String kwdikosAsfaleiasKartas,
		String onomaUser) {
	super(username,password,"Pelatis");
	this.ari8mosKartas = ari8mosKartas;
	this.eidosKartas = eidosKartas;
	this.hmeromhniaLhjhs = hmeromhniaLhjhs;
	this.kwdikosAsfaleiasKartas = kwdikosAsfaleiasKartas;
	this.onomaUser = onomaUser;
}
public Pelatis() {
	super();
}


public Pelatis(String onoma, String ari8mosKartas, String eidosKartas, String hmeromhniaLhjhs, String kwdikosAsfaleiasKartas) {
	this.ari8mosKartas = ari8mosKartas;
	this.eidosKartas = eidosKartas;
	this.hmeromhniaLhjhs = hmeromhniaLhjhs;
	this.kwdikosAsfaleiasKartas = kwdikosAsfaleiasKartas;
	this.onomaUser = onoma;
}
public String getAri8mosKartas() {
	return ari8mosKartas;
}
public void setAri8mosKartas(String ari8mosKartas) {
	this.ari8mosKartas = ari8mosKartas;
}
public String getEidosKartas() {
	return eidosKartas;
}
public void setEidosKartas(String eidosKartas) {
	this.eidosKartas = eidosKartas;
}
public String getHmeromhniaLhjhs() {
	return hmeromhniaLhjhs;
}
public void setHmeromhniaLhjhs(String hmeromhniaLhjhs) {
	this.hmeromhniaLhjhs = hmeromhniaLhjhs;
}
public String getKwdikosAsfaleiasKartas() {
	return kwdikosAsfaleiasKartas;
}
public void setKwdikosAsfaleiasKartas(String kwdikosAsfaleiasKartas) {
	this.kwdikosAsfaleiasKartas = kwdikosAsfaleiasKartas;
}
public String getOnomaUser() {
	return onomaUser;
}
public void setOnomaUser(String onomaUser) {
	this.onomaUser = onomaUser;
}


}
