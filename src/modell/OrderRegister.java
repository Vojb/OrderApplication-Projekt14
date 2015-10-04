package modell;

import java.util.ArrayList;

public class OrderRegister {
	
	
	
	private int counter = 1001;
	ArrayList<Order> order = new ArrayList<Order>();

	public ArrayList<Order> getOrdrar() {
		return order;
	}

	public void setOrdrar(ArrayList<Order> ordrar) {
		this.order = ordrar;
	}

	public void addOrder(Order o) {
		o.setOrdernr(String.valueOf(counter));
		order.add(o);
		counter++;
	}
	public Order hittaOrder(String ordernr) {
		for (Order tmp : order) {
			if (tmp.getOrdernr().equals(ordernr)) {
				return tmp;
			}
		}
		return null;
	}
	public void nyOrder(String ordernr, String bestallare ,String leverans, String levPostOrt, double pris){
		Order order = new Order();
		order.setBestallare(bestallare);
		order.setOrdernr(ordernr);
		order.setLeverans(leverans);
		order.setLevPostOrt(levPostOrt);
		order.setPris(pris);
	}
}
