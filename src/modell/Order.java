package modell;


import java.util.ArrayList;


public class Order {


private String ordernummer;
private Kund kund;
private String leveransadress;
private String leveransadressPostOrt;
private double totPris = 0;
private String bestallare;
private String bestDatum; 
private String leveransdatum; 

ArrayList<Orderrad> orderrad=new ArrayList<Orderrad>();

public String getBestDatum() {
	return bestDatum;
}

public void setBestDatum(String bestDatum) {
	this.bestDatum = bestDatum;
}

public String getLeveransdatum() {
	return leveransdatum;
}

public void setLeveransdatum(String leveransdatum) {
	this.leveransdatum = leveransdatum;
}


public String getLeverans() {
	return leveransadress;
}

public void setLeverans(String leverans) {
	this.leveransadress = leverans;
}

public String getLevPostOrt() {
	return leveransadressPostOrt;
}

public void setLevPostOrt(String levPostOrt) {
	this.leveransadressPostOrt = levPostOrt;
}

public void addOrderrad(Orderrad or){
	orderrad.add(or);
}

public ArrayList<Orderrad> getOrderrader() {
	return orderrad;
}

public void setOrderrader(ArrayList<Orderrad> orderrader) {
	this.orderrad = orderrader;
}

public String getOrdernr() {
	return ordernummer;
}

public void setOrdernr(String ordernr) {
	this.ordernummer = ordernr;
}

public Kund getKund() {
	return kund;
}

public void setKund(Kund kund) {
	this.kund = kund;
}

public double kalkTotOrderPris() {
	for(Orderrad o : orderrad) {
		totPris += o.kalkTotPris();
	}
	return totPris;
}

public double getPris() {
	
	return totPris;
}

public void setPris(double pris) {
	this.totPris = pris;
}

public String getBestallare() {
	return bestallare;
}

public void setBestallare(String bestallare) {
	this.bestallare = bestallare;
}
}
