package Stomatologija;

import java.util.Arrays;

public class Ordinacija {

	private String naziv;
	private Pacijent[] stolica;
	private int poz;
	
	public String getNaziv() {
		return naziv;
	}
	public int getBrStolica() {
		return stolica.length;
	}
	
	public Ordinacija(String naziv, int brStolica) {
		super();
		this.naziv = naziv;
		stolica =new Pacijent[brStolica];
		poz = 0;
	}
	
	public boolean postaviPacijenta(Pacijent p) {
		
		boolean smesten = false;
				for (int i=0; i<stolica.length; i++) {
					if (stolica[poz] == null) {
						stolica[poz] = p;
						smesten = true;
						break;							
					}
					poz = (poz + 1) % stolica.length;
				}
				return smesten;
	}
	
	public boolean ustani(Pacijent p) {
		int i;
		for (  i=0; i<stolica.length; i++) {
			if (stolica[i] == p ) {
				stolica[i] = null;
				return true;
			}
		}
		return false;
		
	}
	
	public String toString() {
		String s = naziv+ "[";
		int brojPacijenata = 0;
		for (int i=0; i<stolica.length; i++) {
			if (stolica[i] != null) brojPacijenata++;
		}
		s += brojPacijenata + ":";
		
		for (int i=0; i<stolica.length; i++) {
			if (stolica[i] != null) s+= " " + stolica[i];
		}
		
		s+= "]";
		
		return s;
	}
}
