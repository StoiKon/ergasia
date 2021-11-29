package com.main.ergasia;

public class hasLanguage {
private String languageName,DVDtitlos;
private int DVDid;
public hasLanguage(String languageName, String dVDtitlos, int dVDid) {
	super();
	this.languageName = languageName;
	DVDtitlos = dVDtitlos;
	DVDid = dVDid;
}
public hasLanguage() {
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
