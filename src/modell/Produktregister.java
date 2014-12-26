package modell;

import java.util.ArrayList;

public class Produktregister {

	ArrayList<Produkt> produkter = new ArrayList<Produkt>();

	public ArrayList<Produkt> getProdukter() {
		return produkter;
	}

	public Produktregister() {
		Produkt p = new Produkt();
		p.setNamn("JohannesKorv");
		p.setPris(130);
		p.setKod("13");
		p.setGrupp("Korv");
		p.setLagerstatus(10);
		p.setViktAntal("10");
	
		produkter.add(p);
		p = new Produkt();
		p.setNamn("EmmasFileer");
		p.setPris(100);
		p.setKod("7");
		p.setGrupp("Kyckling");
		p.setLagerstatus(10);
		p.setViktAntal("10");
		produkter.add(p);
		
	}

	public void addProdukt(Produkt p) {
		produkter.add(p);
	}

	public void setProdukter(ArrayList<Produkt> produkter) {
		this.produkter = produkter;
	}

	public void nyProdukt(String kod, String namn, int pris, String viktAntal,
			String produktgrupp, int lagerStatus, String ovrigInfo) {
		Produkt p = new Produkt();

		p.setNamn(namn);
		p.setKod(kod);
		p.setPris(pris);
		p.setViktAntal(viktAntal);
		p.setLagerstatus(lagerStatus);
		p.setInfo(ovrigInfo);
		p.setGrupp(produktgrupp);
		produkter.add(p);

	}

	public Produkt hittaProdukt(String kod) {
		for (Produkt tmp : produkter) {
			if (tmp.getKod().equals(kod)) {
				return tmp;
			}
		}
		return null;
	}

	public void uppdateraProdukt(String kod, String namn, int pris,
			String viktAntal, String produktgrupp, int lagerStatus, String info) {

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
