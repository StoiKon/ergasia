package com.main.ergasia;

public class HasLanguage {
private String languageName,DVDtitlos;
private int DVDid;
public HasLanguage(String languageName, String dVDtitlos, int dVDid) {
	super();
	this.languageName = languageName;
	DVDtitlos = dVDtitlos;
	DVDid = dVDid;
}
public HasLanguage() {
	super();
}
public String getLanguageName() {
	return languageName;
}
public void setLanguageName(String languageName) {
	this.languageName = languageName;
}
public String getDVDtitlos() {
	return DVDtitlos;
}
public void setDVDtitlos(String dVDtitlos) {
	DVDtitlos = dVDtitlos;
}
public int getDVDid() {
	return DVDid;
}
public void setDVDid(int dVDid) {
	DVDid = dVDid;
}


}
