package modell;

import java.util.ArrayList;

public class Kundregister {
	
public Kundregister() {
		Kund k = new Kund();
		k.setOrgnr("1");
		k.setForetagsnamn("AB Norrby Mat och Frukt");
		k.setFakPostOrt("Norrby");
		k.setFaktura("Lillgatan 3");
		kund.add(k);
		
		k = new Kund();
		k.setOrgnr("2");
		k.setForetagsnamn("Ikea Restauranger AB ");
		k.setFakPostOrt("Malmö");
		k.setFaktura("Storgatan 2");
		kund.add(k);
	}

	ArrayList<Kund> kund = new ArrayList<Kund>();

	public void addKund(Kund k) {
		kund.add(k);
	}

	public ArrayList<Kund> getKunder() {
		return kund;
	}

	public void setKunder(ArrayList<Kund> kunder) {
		this.kund = kunder;
	}

	public void nyKund(String orgnr, String foretagsnamn, String faktura, String fakPostOrt, String kontaktperson, String mail, String telenr) {
		Kund k = new Kund();
		k.setForetagsnamn(foretagsnamn);
		k.setOrgnr(orgnr);
		k.setFaktura(faktura);
		k.setFakPostOrt(fakPostOrt);
		k.setKontaktperson(kontaktperson);
		k.setMail(mail);
		k.setTelenr(telenr);
		kund.add(k);
	}

	public Kund hittaKund(String orgnr) {
		for (Kund tmp : kund) {
			if (tmp.getOrgnr().equals(orgnr)) {
				return tmp;
			}
		}
		return null;
	}

	public void uppdateraKund(String orgnr,String foretagsnamn, String faktura,String fakPostOrt, String kontaktperson, String mail, String telenr) {
		Kund k = hittaKund(orgnr);	
			k.setForetagsnamn(foretagsnamn);
			k.setFaktura(faktura);
			k.setFakPostOrt(fakPostOrt);
			k.setKontaktperson(kontaktperson);
			k.setMail(mail);
			k.setTelenr(telenr);
	}		
}
