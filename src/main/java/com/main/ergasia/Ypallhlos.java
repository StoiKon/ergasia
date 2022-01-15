package com.main.ergasia;

public class Ypallhlos extends User {
private String onoma,typos;

public Ypallhlos() {
	super();
}

public Ypallhlos(String onoma, String typos) {
	super();
	this.onoma = onoma;
	this.typos = typos;
}

public String getOnoma() {
	return onoma;
}

public void setOnoma(String onoma) {
	this.onoma = onoma;
}

public String getTypos() {
	return typos;
}

public void setTypos(String typos) {
	this.typos = typos;
}

}
