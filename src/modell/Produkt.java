package modell;

import java.util.ArrayList;



public class Produkt {
	
private int pris;
private String produktkod;
private String namn;
private String info;
private String viktAntal;
private String grupp;
private int lagerstatus;

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public String getGrupp() {
	return grupp;
}

public void setGrupp(String grupp) {
	this.grupp = grupp;
}



ArrayList<Orderrad> orderrader =new ArrayList<Orderrad>();

public void addOrderrad(Orderrad a){
	orderrader.add(a);
}

public ArrayList<Orderrad>  getOrderrader() {
	return orderrader;
}
public void setOrderrader(ArrayList<Orderrad> orderrader) {
	this.orderrader = orderrader;
}
public int getPris() {
	return pris;
}
public void setPris(int pris) {
	this.pris = pris;
}
public String getKod() {
	return produktkod;
}
public void setKod(String kod) {
	this.produktkod = kod;
}
public String getNamn() {
	return namn;
}
public void setNamn(String namn) {
	this.namn = namn;
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
