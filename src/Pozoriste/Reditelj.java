package Pozoriste;

public class Reditelj extends Zaposleni {

	private String nadimak;

	public Reditelj(String ime_prezime, Pozoriste teatar, String nadimak) {
		super(ime_prezime, teatar);
		this.nadimak = nadimak;
	}

	@Override
	public String toString() {
		return  nadimak + "_" + getIme_prezime() + "["	+ getTeatar().getNaziv() + "]";
	}
	
	
	
	
}
