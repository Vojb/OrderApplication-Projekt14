package modell;

import java.util.ArrayList;



public class OrderRegister {

	private int counter = 1001;
	ArrayList<Order> ordrar = new ArrayList<Order>();

	public ArrayList<Order> getOrdrar() {
		return ordrar;
	}

	public void setOrdrar(ArrayList<Order> ordrar) {
		this.ordrar = ordrar;
	}

	public void addOrder(Order order) {
		order.setOrdernr(String.valueOf(counter));
		ordrar.add(order);
		counter++;
	}
	public Order hittaOrder(String ordernr) {
		for (Order tmp : ordrar) {
			if (tmp.getOrdernr().equals(ordernr)) {
				return tmp;
			}
		}
		return null;
	}
}
