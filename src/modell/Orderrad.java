package modell;


public class Orderrad {
private int antal;
private Order order;
private double orderPris;
private Produkt produkt;

public double getPris() {
	return orderPris;
}

public void setPris(double pris) {
	this.orderPris = pris;
}

public int getAntal() {
	return antal;
}
	
public void setAntal(int antal) {
	this.antal = antal;
}

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public Produkt getProdukt() {
	return produkt;
}

public void setProdukt(Produkt produkt) {
	this.produkt = produkt;
}
public double kalkTotPris(){
		return produkt.getPris()*antal;
}

}
