package modell;

import java.util.ArrayList;

public class Produktregister {

	public Produktregister() {
		Produkt p = new Produkt();
		p.setNamn("Vitlökskorv");
		p.setPris(80);
		p.setKod("1");
		p.setGrupp("Korv");
		p.setLagerstatus(200);
		p.setViktAntal("10 st");
	
		produkt.add(p);
		p = new Produkt();
		p.setNamn("Fläskkorv");
		p.setPris(90);
		p.setKod("2");
		p.setGrupp("Korv");
		p.setLagerstatus(200);
		p.setViktAntal("10 st");
		produkt.add(p);
		
		p = new Produkt();
		p.setNamn("Julskinka");
		p.setPris(200);
		p.setKod("3");
		p.setGrupp("Skinka");
		p.setLagerstatus(200);
		p.setViktAntal("500 g");
		produkt.add(p);
		
	}
	ArrayList<Produkt> produkt = new ArrayList<Produkt>();

	public ArrayList<Produkt> getProdukter() {
		return produkt;
	}


	public void addProdukt(Produkt p) {
		produkt.add(p);
	}

	public void setProdukter(ArrayList<Produkt> produkter) {
		this.produkt = produkter;
	}

	public void nyProdukt(String kod, String namn, int pris, String viktAntal, String produktgrupp, int lagerStatus, String ovrigInfo) {
		Produkt p = new Produkt();
		p.setNamn(namn);
		p.setKod(kod);
		p.setPris(pris);
		p.setViktAntal(viktAntal);
		p.setLagerstatus(lagerStatus);
		p.setInfo(ovrigInfo);
		p.setGrupp(produktgrupp);
		produkt.add(p);
	}

	public Produkt hittaProdukt(String kod) {
		for (Produkt tmp : produkt) {
			if (tmp.getKod().equals(kod)) {
				return tmp;
			}
		}
		return null;
	}

	public void uppdateraProdukt(String kod, String namn, int pris, String viktAntal, String produktgrupp, int lagerStatus, String info) {
		Produkt p = hittaProdukt(kod);
		if (p.getKod().equals(kod)) {
			p.setNamn(namn);
			p.setPris(pris);
			p.setViktAntal(viktAntal);
			p.setGrupp(produktgrupp);
			p.setLagerstatus(lagerStatus);
			p.setInfo(info);
		}
	}
}
