package com.main.ergasia;

public class User {
private String onoma,kwdikos,rolos;

public User() {

}

public User(String onoma, String kwdikos,String rolos) {
	super();
	this.onoma = onoma;
	this.kwdikos = kwdikos;
	this.rolos=rolos;
}

public String getOnoma() {
	return onoma;
}

public void setOnoma(String onoma) {
	this.onoma = onoma;
}

public String getKwdikos() {
	return kwdikos;
}

public void setKwdikos(String kwdikos) {
	this.kwdikos = kwdikos;
}

public String getRolos() {
	return rolos;
}

public void setRolos(String rolos) {
	this.rolos = rolos;
}

}
