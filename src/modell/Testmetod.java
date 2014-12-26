package modell;

public class Testmetod {

public static void main(String args ){
	
	Kundregister kr =new Kundregister ();
	Kund k= new Kund();
	Order o=new Order();
	Produkt v =new Produkt();
	Orderrad or=new Orderrad();
	
	k.setForetagsnamn("Företag");
	k.setOrgnr("2");

	k.setFakPostOrt("Lund");
	k.setFaktura("Lillvägen 12");
	k.setMail("något@hotmail.com");
	k.setKontaktperson("Konrad Kontakt");
	k.setTelenr("Tele");
	kr.addKund(k);
	
	
}
}