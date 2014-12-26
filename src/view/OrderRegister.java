package view;

import java.util.ArrayList;

import modell.Order;

public class OrderRegister {

	private int counter = 1000;
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
}
