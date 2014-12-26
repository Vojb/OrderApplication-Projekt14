package modell;
import java.util.ArrayList;


public class Kund {

private String foretagsnamn;
private String orgnr;
private String mail;
private String kontaktperson;

private String faktura;
private String fakPostOrt;
private String telenr;

private ArrayList<Order> ordrar =new ArrayList<Order>();

public String getForetagsnamn() {
	return foretagsnamn;
}

public void setForetagsnamn(String foretagsnamn) {
	this.foretagsnamn = foretagsnamn;
}

public String getOrgnr() {
	return orgnr;
}

public void setOrgnr(String orgnr) {
	this.orgnr = orgnr;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getKontaktperson() {
	return kontaktperson;
}

public void setKontaktperson(String kontaktperson) {
	this.kontaktperson = kontaktperson;
}

public String getFaktura() {
	return faktura;
}

public void setFaktura(String faktura) {
	this.faktura = faktura;
}

public String getFakPostOrt() {
	return fakPostOrt;
}

public void setFakPostOrt(String fakPostOrt) {
	this.fakPostOrt = fakPostOrt;
}

public String getTelenr() {
	return telenr;
}

public void setTelenr(String telenr) {
	this.telenr = telenr;
}

public void addOrder(Order o){
	ordrar.add(o);
}

public ArrayList<Order> getOrdrar() {
	return ordrar;
}

public void setOrdrar(ArrayList<Order> ordrar) {
	this.ordrar = ordrar;
}

}