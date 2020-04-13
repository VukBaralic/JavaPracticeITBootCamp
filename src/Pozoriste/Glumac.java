package Pozoriste;

public class Glumac extends Zaposleni {

	private String uloga;

	public Glumac(String ime_prezime, Pozoriste teatar, String uloga) {
		super(ime_prezime, teatar);
		this.uloga = uloga;
	}
	

	@Override
	public String toString() {
		return  uloga + "_" + getIme_prezime() + "[" + getTeatar().getNaziv() + "]";
	}

	public String getUloga() {
		return uloga;
	}

	
	
	
}
