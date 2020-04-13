package Pozoriste;

import java.util.ArrayList;

public class Predstava {

	private String naziv;
	private Pozoriste pozornica;
	private ArrayList<Zaposleni> radnici;
	
	public static int brZaposlenih;

	public Predstava(String naziv, Pozoriste pozornica, Zaposleni nizRadnika) {
		super();
		this.naziv = naziv;
		this.pozornica = pozornica;
		radnici = new ArrayList<Zaposleni>();
		radnici.add(nizRadnika);
		brZaposlenih++;
	}
	
	public void dodajZaposlenog(Zaposleni z) {
	radnici.add(z);
	}
	
	public void oduzmiZaposlenog(Zaposleni z) {
		radnici.remove(z);
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozornica() {
		return pozornica;
	}

	public ArrayList<Zaposleni> getRadnici() {
		return radnici;
	}

	public int getBrZaposlenih() {
		return radnici.size();
	}

	@Override
	public String toString() {
		String poruka = naziv + ", " + pozornica + " , radnici: \n";
		for (int i = 0; i < radnici.size(); i++) {
			poruka += radnici.get(i).toString() + '\n';
		}
		return poruka;
	}
	
	
}
