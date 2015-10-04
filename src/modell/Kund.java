package modell;
import java.util.ArrayList;


public class Kund {

private String foretagsnamn;
private String organisationsnummer;
private String emailadress;
private String kontaktperson;
private String fakturaadress;
private String fakturaadressPostOrt;
private String telefonnummer;
private ArrayList<Order> order =new ArrayList<Order>();

public String getForetagsnamn() {
	return foretagsnamn;
}

public void setForetagsnamn(String foretagsnamn) {
	this.foretagsnamn = foretagsnamn;
}

public String getOrgnr() {
	return organisationsnummer;
}

public void setOrgnr(String orgnr) {
	this.organisationsnummer = orgnr;
}

public String getMail() {
	return emailadress;
}

public void setMail(String mail) {
	this.emailadress = mail;
}

public String getKontaktperson() {
	return kontaktperson;
}

public void setKontaktperson(String kontaktperson) {
	this.kontaktperson = kontaktperson;
}

public String getFaktura() {
	return fakturaadress;
}

public void setFaktura(String faktura) {
	this.fakturaadress = faktura;
}

public String getFakPostOrt() {
	return fakturaadressPostOrt;
}

public void setFakPostOrt(String fakPostOrt) {
	this.fakturaadressPostOrt = fakPostOrt;
}

public String getTelenr() {
	return telefonnummer;
}

public void setTelenr(String telenr) {
	this.telefonnummer = telenr;
}

public void addOrder(Order o){
	order.add(o);
}

public ArrayList<Order> getOrdrar() {
	return order;
}

public void setOrdrar(ArrayList<Order> ordrar) {
	this.order = ordrar;
}

}