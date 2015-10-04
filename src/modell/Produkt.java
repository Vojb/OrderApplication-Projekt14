package modell;

import java.util.ArrayList;


public class Produkt {
	
private double pris;
private String produktkod;
private String produktNamn; 
private String info;
private String viktAntal;
private String produktgrupp;
private int lagerstatus;

ArrayList<Orderrad> orderrader =new ArrayList<Orderrad>();

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public String getGrupp() {
	return produktgrupp;
}

public void setGrupp(String grupp) {
	this.produktgrupp = grupp;
}

public void addOrderrad(Orderrad a){
	orderrader.add(a);
}

public ArrayList<Orderrad>  getOrderrader() {
	return orderrader;
}

public void setOrderrader(ArrayList<Orderrad> orderrader) {
	this.orderrader = orderrader;
}

public double getPris() {
	return pris;
}

public void setPris(double pris) {
	this.pris = pris;
}

public String getKod() {
	return produktkod;
}

public void setKod(String kod) {
	this.produktkod = kod;
}

public String getNamn() {
	return produktNamn;
}

public void setNamn(String namn) {
	this.produktNamn = namn;
}

public int getLagerstatus() {
	return lagerstatus;
}

public void setLagerstatus(int lagerstatus) {
	this.lagerstatus = lagerstatus;
}

public String getViktAntal() {
	return viktAntal;
}

public void setViktAntal(String viktAntal) {
	this.viktAntal = viktAntal;
}
}