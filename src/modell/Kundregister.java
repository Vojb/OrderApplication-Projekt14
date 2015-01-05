package modell;

import java.util.ArrayList;

public class Kundregister {
	
public Kundregister() {
		Kund k = new Kund();
		k.setOrgnr("1");
		k.setForetagsnamn("Mormors Bageri");
		k.setFakPostOrt("Lund");
		k.setFaktura("Lillgatan 3");
		kunder.add(k);
		k = new Kund();
		k.setOrgnr("2");
		k.setForetagsnamn("Farfars Bageri");
		k.setFakPostOrt("Lund");
		k.setFaktura("Storgatan 2");
		kunder.add(k);
	}
	ArrayList<Kund> kunder = new ArrayList<Kund>();

	

	public void addKund(Kund k) {
		kunder.add(k);
	}

	public ArrayList<Kund> getKunder() {
		return kunder;
	}

	public void setKunder(ArrayList<Kund> kunder) {
		this.kunder = kunder;
	}

	public void nyKund(String orgnr, String foretagsnamn, String faktura,
			String fakPostOrt, String kontaktperson, String mail, String telenr) {
		Kund k = new Kund();

		k.setForetagsnamn(foretagsnamn);
		k.setOrgnr(orgnr);
		k.setFaktura(faktura);
		k.setFakPostOrt(fakPostOrt);
		k.setKontaktperson(kontaktperson);
		k.setMail(mail);
		k.setTelenr(telenr);
		kunder.add(k);
	}

	public Kund hittaKund(String orgnr) {
		for (Kund tmp : kunder) {
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
