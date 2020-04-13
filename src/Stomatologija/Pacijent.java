package Stomatologija;

public class Pacijent {

	private static int globalId = 0;
	private int id;
	private String ime_prezime;
	private String brKnjizce;
	
	public Pacijent( String ime_prezime, String brKnjizce) {
		id = globalId++;
		this.ime_prezime = ime_prezime;
		this.brKnjizce = brKnjizce;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}

	public void setIme_prezime(String ime_prezime) {
		this.ime_prezime = ime_prezime;
	}

	public int getId() {
		return id;
	}

	public String getBrKnjizce() {
		return brKnjizce;
	}

	@Override
	public String toString() {
		return  ime_prezime + "[" + id + ":" + brKnjizce + "]";
	}
	
	
	
	
	
}
