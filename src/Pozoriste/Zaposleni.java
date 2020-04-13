package Pozoriste;

public class Zaposleni {
	
	private String ime_prezime;
	private Pozoriste teatar;
	
	public String getIme_prezime() {
		return ime_prezime;
	}
	public Pozoriste getTeatar() {
		return teatar;
	}
	
	public Zaposleni(String ime_prezime, Pozoriste teatar) {
		this.ime_prezime = ime_prezime;
		this.teatar = teatar;
	}
	@Override
	public String toString() {
		return  ime_prezime + "[" + teatar.getNaziv() + "]";
	}
	
	

}
