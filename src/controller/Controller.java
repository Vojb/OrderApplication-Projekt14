package controller;

import java.util.ArrayList;

import view.OrderRegister;
import modell.Kund;
import modell.Kundregister;
import modell.Order;
import modell.Orderrad;
import modell.Produkt;
import modell.Produktregister;

public class Controller {

	private Kundregister register = new Kundregister();
	private Produktregister pregister = new Produktregister();
	private OrderRegister oregister =new OrderRegister();
	

	public ArrayList<Order> getOrdrar(){
		return oregister.getOrdrar();
	}
	public void addOrder(Order order) {
		oregister.addOrder(order);
	}
	public ArrayList<Kund> getKunder() {
		return register.getKunder();
	}
	public ArrayList<Produkt> getProdukter() {
		return pregister.getProdukter();
	}

	public void nyKund(String orgnr, String foretagsnamn, String faktura,
			String fakPostOrt, String kontaktperson, String mail, String telenr) {
		register.nyKund(orgnr, foretagsnamn, faktura, fakPostOrt,
				kontaktperson, mail, telenr);
	}

	public Kund hittaKund(String orgnr) {
		return register.hittaKund(orgnr);
	}
	public void uppdateraKund(String orgnr,String foretagsnamn, String faktura,
			String fakPostOrt, String kontaktperson, String mail, String telenr) {
		register.uppdateraKund(orgnr,foretagsnamn, faktura, fakPostOrt,
				kontaktperson, mail, telenr);
	}
	public void nyProdukt(String kod,String namn, int pris, String viktAntal,String produktgrupp, int lagerStatus, String ovrigInfo) {
		pregister.nyProdukt(kod,namn, pris,viktAntal,produktgrupp,lagerStatus,ovrigInfo);
	}
	public Produkt hittaProdukt(String kod) {
		return pregister.hittaProdukt(kod);
	}
	public void uppdateraProdukt(String kod, String namn, int pris,
				String viktAntal, String produktgrupp, int lagerStatus,
				String info){
		pregister.uppdateraProdukt(kod, namn, pris, viktAntal, produktgrupp, lagerStatus, info);
		
	}
	
}