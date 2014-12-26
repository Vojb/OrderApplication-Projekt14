package modell;


import java.util.ArrayList;


public class Order {

private String ordernr;
private Kund kund;
private String leverans;
private String levPostOrt;
private double pris=0;


public String getLeverans() {
	return leverans;
}
public void setLeverans(String leverans) {
	this.leverans = leverans;
}
public String getLevPostOrt() {
	return levPostOrt;
}
public void setLevPostOrt(String levPostOrt) {
	this.levPostOrt = levPostOrt;
}

ArrayList<Orderrad> orderrader=new ArrayList<Orderrad>();

public void addOrderrad(Orderrad a){
	orderrader.add(a);
}
public ArrayList<Orderrad> getOrderrader() {
	return orderrader;
}

public void setOrderrader(ArrayList<Orderrad> orderrader) {
	this.orderrader = orderrader;
}

public String getOrdernr() {
	return ordernr;
}

public void setOrdernr(String ordernr) {
	this.ordernr = ordernr;
}

public Kund getKund() {
	return kund;
}

public void setKund(Kund kund) {
	this.kund = kund;
}
public void totalprisorder(){
	
	for(Orderrad o : orderrader){
		setPris(getPris() + o.kalktotpris());
	}
 
}
public double getPris() {
	return pris;
}
public void setPris(double pris) {
	this.pris = pris;
}
}
